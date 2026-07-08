package com.ling.ovndovzmqservice;

import java.util.Arrays;

public enum OvMessageType {
    KV17CVLINFO("KV17cvlinfo"),
    KV15MESSAGES("KV15messages"),
    KV6POSINFO("KV6posinfo");

    private final String value;

    public String getValue() {
        return value;
    }

    OvMessageType(String value) {
        this.value = value;
    }

    public static OvMessageType fromValue(String type) {
        return Arrays.stream(values())
                .filter(t -> t.value.equals(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown type: " + type));
    }
}
