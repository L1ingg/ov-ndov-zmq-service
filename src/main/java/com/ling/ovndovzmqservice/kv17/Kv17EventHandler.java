package com.ling.ovndovzmqservice.kv17;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ling.ovndovzmqservice.OvEvent;
import com.ling.ovndovzmqservice.OvMessageType;
import com.ling.ovndovzmqservice.kv15.dto.DeleteMessage;
import com.ling.ovndovzmqservice.kv15.dto.Kv15Envelope;
import com.ling.ovndovzmqservice.kv15.dto.Kv15Payload;
import com.ling.ovndovzmqservice.kv15.dto.StopMessage;
import com.ling.ovndovzmqservice.kv17.dto.Kv17Envelope;
import com.ling.ovndovzmqservice.kv17.dto.Kv17Payload;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

@Component
public class Kv17EventHandler {

    private final XmlMapper xmlMapper;
    private final ObjectMapper jsonMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "ndov.kv17";

    public Kv17EventHandler(XmlMapper xmlMapper, ObjectMapper jsonMapper, KafkaTemplate<String, String> kafkaTemplate) {
        this.xmlMapper = xmlMapper;
        this.jsonMapper = jsonMapper;
        this.kafkaTemplate = kafkaTemplate;
    }


    @EventListener
    public void onKv17Event(OvEvent event) throws JsonProcessingException {
        if (!event.type().equals(OvMessageType.KV17CVLINFO)) return;
        Kv17Envelope envelope = xmlMapper.readValue(event.xml(), Kv17Envelope.class);
        for (Kv17Payload payload : envelope.getPayloads()) {
            kafkaTemplate.send(TOPIC, jsonMapper.writeValueAsString(payload.getJourney()));
            kafkaTemplate.send(TOPIC, jsonMapper.writeValueAsString(payload.getMutateJourney()));
            kafkaTemplate.send(TOPIC, jsonMapper.writeValueAsString(payload.getMutateJourneyStop()));
        }
    }

}
