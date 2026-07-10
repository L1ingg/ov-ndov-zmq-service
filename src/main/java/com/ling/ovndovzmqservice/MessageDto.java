package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.databind.JsonNode;

public record MessageDto(String type, JsonNode message) {
}
