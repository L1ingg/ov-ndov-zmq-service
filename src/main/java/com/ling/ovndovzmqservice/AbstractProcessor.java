package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class AbstractProcessor<T extends Event> implements Processor<T> {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper jsonMapper;

    public AbstractProcessor(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper jsonMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.jsonMapper = jsonMapper;
    }

    @Override
    public void process(String to, T t) throws JsonProcessingException {
        kafkaTemplate.send(to, jsonMapper.writeValueAsString(t));
    }
}
