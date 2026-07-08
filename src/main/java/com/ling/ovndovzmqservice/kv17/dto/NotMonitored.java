package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class NotMonitored {

    @JacksonXmlProperty(localName = "monitoringerror")
    private String monitoringError;

    public String getMonitoringError() {
        return monitoringError;
    }

    public void setMonitoringError(String monitoringError) {
        this.monitoringError = monitoringError;
    }
}
