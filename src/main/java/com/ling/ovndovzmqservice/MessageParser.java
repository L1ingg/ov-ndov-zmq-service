package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMsg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.zip.GZIPInputStream;

@Component
public class MessageParser implements Parser {

    private final String url;
    private final XmlMapper xmlMapper;
    private final ApplicationEventPublisher publisher;

    public MessageParser(@Value("${source.url}") String url, XmlMapper xmlMapper, ApplicationEventPublisher publisher) {
        this.url = url;
        this.xmlMapper = xmlMapper;
        this.publisher = publisher;
    }

    @EventListener(ApplicationReadyEvent.class)
    private void startup() {
        parse();
    }

    @Override
    public void parse() {
        try (ZContext context = new ZContext()) {
            var socket = context.createSocket(SocketType.SUB);
            socket.connect(url);
            socket.subscribe("".getBytes(StandardCharsets.UTF_8));
            socket.setReceiveTimeOut(1000);

            while (!Thread.currentThread().isInterrupted()) {
                ZMsg msg = ZMsg.recvMsg(socket);
                if (msg == null) {
                    continue;
                }

                byte[] payload = extractPayload(msg);
                if (payload == null || payload.length == 0) {
                    continue;
                }

                String xml = decodePayload(payload);
                JsonNode node = xmlMapper.readTree(xml);

                JsonNode dossierNameNode = node.path("DossierName");
                if (dossierNameNode == null || dossierNameNode.isNull()) {
                    continue;
                }

                String rawMessageType = dossierNameNode.asText();

                MessageType messageType;
                try {
                    messageType = MessageType.fromValue(rawMessageType);
                } catch (Exception e) {
                    continue;
                }

                node = node.path(messageType.getValue());

                for (Map.Entry<String, JsonNode> entry : node.properties()) {
                    String type = entry.getKey();
                    JsonNode messages = entry.getValue();

                    publisher.publishEvent(
                            new EventDto(
                                    messageType,
                                    new MessageDto(type, messages)
                            )
                    );
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to listen on ZeroMQ socket", e);
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
}
