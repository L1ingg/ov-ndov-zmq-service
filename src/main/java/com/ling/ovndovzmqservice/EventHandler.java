package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ling.ovndovzmqservice.kafka.KafkaTopicConfig;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {
    private final AbstractProcessor<EventDto> processor;
    private final KafkaTopicConfig config;

    public EventHandler(AbstractProcessor<EventDto> processor, KafkaTopicConfig config, MessageParser parser) {
        this.processor = processor;
        this.config = config;
    }

    @EventListener
    public void handle(EventDto dto) throws JsonProcessingException {
        processor.process(config.TransportMessages().name(), dto);
    }

}
