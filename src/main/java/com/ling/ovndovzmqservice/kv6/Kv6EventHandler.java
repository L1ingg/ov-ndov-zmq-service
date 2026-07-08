package com.ling.ovndovzmqservice.kv6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ling.ovndovzmqservice.OvEvent;
import com.ling.ovndovzmqservice.OvMessageType;
import com.ling.ovndovzmqservice.kv6.dto.Kv6Envelope;
import com.ling.ovndovzmqservice.kv6.dto.Kv6Event;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

@Component
public class Kv6EventHandler {

    private final XmlMapper xmlMapper;
    private final ObjectMapper jsonMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "ndov.kv6";

    public Kv6EventHandler(XmlMapper xmlMapper, ObjectMapper jsonMapper, KafkaTemplate<String, String> kafkaTemplate) {
        this.xmlMapper = xmlMapper;
        this.jsonMapper = jsonMapper;
        this.kafkaTemplate = kafkaTemplate;
    }


    @EventListener
    public void onKv6Event(OvEvent event) throws JsonProcessingException {
        if (!event.type().equals(OvMessageType.KV6POSINFO)) return;
        Kv6Envelope envelope = xmlMapper.readValue(event.xml(), Kv6Envelope.class);
        for (Kv6Event e : envelope.getPayload().getAll()) {
            kafkaTemplate.send(TOPIC, jsonMapper.writeValueAsString(e));
        }
    }

}
