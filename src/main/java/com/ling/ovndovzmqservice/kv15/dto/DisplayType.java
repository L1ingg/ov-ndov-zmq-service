package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class DisplayType {

    @JacksonXmlText
    private String value;

    @JacksonXmlProperty(localName = "clearmessage", isAttribute = true)
    private Boolean clearMessage;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getClearMessage() {
        return clearMessage;
    }

    public void setClearMessage(Boolean clearMessage) {
        this.clearMessage = clearMessage;
    }
}