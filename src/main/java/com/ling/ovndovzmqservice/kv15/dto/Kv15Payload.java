package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "KV15messages")
public class Kv15Payload {

    @JacksonXmlProperty(localName = "STOPMESSAGE")
    private List<StopMessage> stopMessages = new ArrayList<>();
    
    @JacksonXmlProperty(localName = "DELETEMESSAGE") 
    private List<DeleteMessage> deleteMessages = new ArrayList<>();

    public List<StopMessage> getStopMessages() {
        return stopMessages;
    }

    public void setStopMessages(List<StopMessage> stopMessages) {
        this.stopMessages = stopMessages;
    }

    public List<DeleteMessage> getDeleteMessages() {
        return deleteMessages;
    }

    public void setDeleteMessages(List<DeleteMessage> deleteMessages) {
        this.deleteMessages = deleteMessages;
    }
}
