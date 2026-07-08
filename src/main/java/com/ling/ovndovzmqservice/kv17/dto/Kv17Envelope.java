package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ling.ovndovzmqservice.KvHeader;

import java.util.ArrayList;
import java.util.List;

public class Kv17Envelope extends KvHeader {
    @JacksonXmlProperty(localName = "KV17posinfo")
    private List<Kv17Payload> payloads = new ArrayList<>();

    public Kv17Envelope(String subscriberId, String version, String dossierName, String timestamp, List<Kv17Payload> data) {
        super(subscriberId, version, dossierName, timestamp);
        this.payloads = data;
    }

    public Kv17Envelope() {
    }

    public List<Kv17Payload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<Kv17Payload> payloads) {
        this.payloads = payloads;
    }
}
