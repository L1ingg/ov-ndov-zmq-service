package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EventDto(MessageType type, @JsonProperty("payload") MessageDto data) implements Event {
}
