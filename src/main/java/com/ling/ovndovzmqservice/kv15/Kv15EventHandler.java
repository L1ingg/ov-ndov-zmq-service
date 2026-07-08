package com.ling.ovndovzmqservice.kv15;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ling.ovndovzmqservice.OvEvent;
import com.ling.ovndovzmqservice.OvMessageType;
import com.ling.ovndovzmqservice.kv15.dto.DeleteMessage;
import com.ling.ovndovzmqservice.kv15.dto.Kv15Envelope;
import com.ling.ovndovzmqservice.kv15.dto.Kv15Payload;
import com.ling.ovndovzmqservice.kv15.dto.StopMessage;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

@Component
public class Kv15EventHandler {

    private final XmlMapper xmlMapper;
    private final ObjectMapper jsonMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "ndov.kv15";

    public Kv15EventHandler(XmlMapper xmlMapper, ObjectMapper jsonMapper, KafkaTemplate<String, String> kafkaTemplate) {
        this.xmlMapper = xmlMapper;
        this.jsonMapper = jsonMapper;
        this.kafkaTemplate = kafkaTemplate;
    }


    @EventListener
    public void onKv15Event(OvEvent event) throws JsonProcessingException {
        if (!event.type().equals(OvMessageType.KV15MESSAGES)) return;
        Kv15Envelope envelope = xmlMapper.readValue(event.xml(), Kv15Envelope.class);
        for (Kv15Payload payload : envelope.getPayloads()) {
            for (DeleteMessage deleteMessage : payload.getDeleteMessages()) {
                kafkaTemplate.send(TOPIC, jsonMapper.writeValueAsString(deleteMessage));
            }
            for (StopMessage stopMessage : payload.getStopMessages()) {
                kafkaTemplate.send(TOPIC, jsonMapper.writeValueAsString(stopMessage));
            }
        }
    }

}
