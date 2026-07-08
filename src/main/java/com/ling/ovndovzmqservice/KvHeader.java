package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "VV_TM_PUSH")
public class KvHeader {

    @JsonProperty("SubscriberID")
    private String subscriberId;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("DossierName")
    private String dossierName;

    @JsonProperty("Timestamp")
    private String timestamp;

    public KvHeader() {
    }

    public KvHeader(String subscriberId, String version, String dossierName, String timestamp) {
        this.subscriberId = subscriberId;
        this.version = version;
        this.dossierName = dossierName;
        this.timestamp = timestamp;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDossierName() {
        return dossierName;
    }

    public void setDossierName(String dossierName) {
        this.dossierName = dossierName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}