package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ling.ovndovzmqservice.KvHeader;

import java.util.ArrayList;
import java.util.List;

public class Kv15Envelope extends KvHeader {

    @JacksonXmlProperty(localName = "KV15messages")
    private List<Kv15Payload> payloads = new ArrayList<>();

    public Kv15Envelope(List<Kv15Payload> payloads) {
        this.payloads = payloads;
    }

    public Kv15Envelope() {
    }

    public Kv15Envelope(String subscriberId, String version, String dossierName, String timestamp, List<Kv15Payload> payloads) {
        super(subscriberId, version, dossierName, timestamp);
        this.payloads = payloads;
    }

    public List<Kv15Payload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<Kv15Payload> payloads) {
        this.payloads = payloads;
    }
}
