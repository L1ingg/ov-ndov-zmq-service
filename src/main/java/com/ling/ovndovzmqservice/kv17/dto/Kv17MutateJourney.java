package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Kv17MutateJourney {

    @JacksonXmlProperty(localName = "timestamp")
    private String timestamp;

    @JacksonXmlProperty(localName = "CANCEL")
    private Cancel cancel;

    @JacksonXmlProperty(localName = "RECOVER")
    private Recover recover;

    @JacksonXmlProperty(localName = "ADD")
    private Add add;

    @JacksonXmlProperty(localName = "NOTMONITORED")
    private NotMonitored notMonitored;

    public Kv17MutateJourney(String timestamp, Cancel cancel, Recover recover, Add add, NotMonitored notMonitored) {
        this.timestamp = timestamp;
        this.cancel = cancel;
        this.recover = recover;
        this.add = add;
        this.notMonitored = notMonitored;
    }

    public Kv17MutateJourney() {
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Cancel getCancel() {
        return cancel;
    }

    public void setCancel(Cancel cancel) {
        this.cancel = cancel;
    }

    public Recover getRecover() {
        return recover;
    }

    public void setRecover(Recover recover) {
        this.recover = recover;
    }

    public Add getAdd() {
        return add;
    }

    public void setAdd(Add add) {
        this.add = add;
    }

    public NotMonitored getNotMonitored() {
        return notMonitored;
    }

    public void setNotMonitored(NotMonitored notMonitored) {
        this.notMonitored = notMonitored;
    }
}
