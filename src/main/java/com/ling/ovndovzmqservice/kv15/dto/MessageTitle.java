package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class MessageTitle {

    @JacksonXmlText
    private String value;

    @JacksonXmlProperty(localName = "separatetitle", isAttribute = true)
    private Boolean separateTitle;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getSeparateTitle() {
        return separateTitle;
    }

    public void setSeparateTitle(Boolean separateTitle) {
        this.separateTitle = separateTitle;
    }
}