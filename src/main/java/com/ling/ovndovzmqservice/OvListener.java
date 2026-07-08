package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMsg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;
import java.util.zip.GZIPInputStream;

@Service
public class OvListener {

    private static final int QUEUE_CAPACITY = 10_000;

    private final String url;
    private final XmlMapper xmlMapper;
    private final ApplicationEventPublisher publisher;

    private final ExecutorService executor = Executors.newFixedThreadPool(3);
    private final BlockingQueue<OvEvent> queue = new LinkedBlockingQueue<>(QUEUE_CAPACITY);

    private volatile boolean running = true;

    public OvListener(@Value("${ov.url}") String url,
                      XmlMapper xmlMapper,
                      ApplicationEventPublisher publisher) {
        this.url = url;
        this.xmlMapper = xmlMapper;
        this.publisher = publisher;
    }

    @PostConstruct
    public void start() {
        executor.submit(this::listen);
        executor.submit(this::processQueue);
        executor.submit(this::monitorQueue);
    }

    private void listen() {
        try (ZContext context = new ZContext()) {
            var socket = context.createSocket(SocketType.SUB);
            socket.connect(url);
            socket.subscribe("".getBytes(StandardCharsets.UTF_8));
            socket.setReceiveTimeOut(1000);

            while (running && !Thread.currentThread().isInterrupted()) {
                ZMsg msg = ZMsg.recvMsg(socket);
                if (msg == null) {
                    continue;
                }

                byte[] payload = extractPayload(msg);
                if (payload == null || payload.length == 0) {
                    continue;
                }

                String xml = decodePayload(payload);
                JsonNode root = xmlMapper.readTree(xml);

                JsonNode dossierNameNode = root.get("DossierName");
                if (dossierNameNode == null || dossierNameNode.isNull()) {
                    continue;
                }

                String type = dossierNameNode.asText();

                OvMessageType messageType;
                try {
                    messageType = OvMessageType.fromValue(type);
                } catch (Exception e) {
                    continue;
                }

                OvEvent event = switch (messageType) {
                    case KV6POSINFO -> new OvEvent(OvMessageType.KV6POSINFO, xml);
                    case KV15MESSAGES -> new OvEvent(OvMessageType.KV15MESSAGES, xml);
                    case KV17CVLINFO -> new OvEvent(OvMessageType.KV17CVLINFO, xml);
                };

                boolean accepted = queue.offer(event);
                if (!accepted) {
                    System.out.println("QUEUE FULL -> dropping event");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to listen on ZeroMQ socket", e);
        }
    }

    private void processQueue() {
        while (running && !Thread.currentThread().isInterrupted()) {
            try {
                OvEvent event = queue.take();
                publisher.publishEvent(event);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } catch (Exception e) {
                System.out.println("Failed to publish event: " + e.getMessage());
            }
        }
    }

    private void monitorQueue() {
        while (running && !Thread.currentThread().isInterrupted()) {
            try {
                int size = queue.size();
                int remaining = queue.remainingCapacity();
                int usedPercent = (int) ((size * 100.0) / QUEUE_CAPACITY);

                System.out.printf(
                        "QUEUE: size=%d remaining=%d used=%d%%%n",
                        size, remaining, usedPercent
                );

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private byte[] extractPayload(ZMsg msg) {
        byte[] payload = null;
        while (!msg.isEmpty()) {
            payload = msg.pop().getData();
        }
        return payload;
    }

    private String decodePayload(byte[] payload) throws IOException {
        if (isGzip(payload)) {
            try (GZIPInputStream gzip = new GZIPInputStream(new ByteArrayInputStream(payload))) {
                return new String(gzip.readAllBytes(), StandardCharsets.UTF_8);
            }
        }
        return new String(payload, StandardCharsets.UTF_8);
    }

    private boolean isGzip(byte[] data) {
        return data.length > 2
                && data[0] == (byte) 0x1F
                && data[1] == (byte) 0x8B;
    }

    @PreDestroy
    public void shutdown() {
        running = false;
        executor.shutdownNow();
        try {
            executor.awaitTermination(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}