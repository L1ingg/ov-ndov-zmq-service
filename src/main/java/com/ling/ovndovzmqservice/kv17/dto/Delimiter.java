package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "delimiter")
public class Delimiter {

    @JacksonXmlProperty(localName = "since", isAttribute = true)
    private String since;

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }
}
