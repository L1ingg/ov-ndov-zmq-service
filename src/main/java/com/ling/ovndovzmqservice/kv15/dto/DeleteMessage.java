package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DeleteMessage {
    private final Kv15MessageType type = Kv15MessageType.DELETE_MESSAGE;

    @JacksonXmlProperty(localName = "dataownercode")
    private String dataOwnerCode;

    @JacksonXmlProperty(localName = "messagecodedate")
    private String messageCodeDate;

    @JacksonXmlProperty(localName = "messagecodenumber")
    private Integer messageCodeNumber;

    public Kv15MessageType type() {
        return type;
    }

    public String getDataOwnerCode() {
        return dataOwnerCode;
    }

    public void setDataOwnerCode(String dataOwnerCode) {
        this.dataOwnerCode = dataOwnerCode;
    }

    public String getMessageCodeDate() {
        return messageCodeDate;
    }

    public void setMessageCodeDate(String messageCodeDate) {
        this.messageCodeDate = messageCodeDate;
    }

    public Integer getMessageCodeNumber() {
        return messageCodeNumber;
    }

    public void setMessageCodeNumber(Integer messageCodeNumber) {
        this.messageCodeNumber = messageCodeNumber;
    }
}