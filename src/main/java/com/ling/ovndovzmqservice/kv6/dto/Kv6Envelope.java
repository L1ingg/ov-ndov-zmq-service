package com.ling.ovndovzmqservice.kv6.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ling.ovndovzmqservice.KvHeader;

public class Kv6Envelope extends KvHeader {

        @JacksonXmlProperty(localName = "KV6posinfo")
        private Kv6Payload payload;

        public Kv6Envelope() {
        }

        public Kv6Envelope(Kv6Payload payload) {
                this.payload = payload;
        }

        public Kv6Envelope(String subscriberId, String version, String dossierName, String timestamp, Kv6Payload payload) {
                super(subscriberId, version, dossierName, timestamp);
                this.payload = payload;
        }

        public Kv6Payload getPayload() {
                return payload;
        }

        public void setPayload(Kv6Payload payload) {
                this.payload = payload;
        }
}