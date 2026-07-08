package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "LAG")
public class LagDto {

    @JacksonXmlProperty(localName = "userstopcode")
    private String userStopCode;

    @JacksonXmlProperty(localName = "passagesequencenumber")
    private Integer passageSequenceNumber;

    @JacksonXmlProperty(localName = "lagtime")
    private Integer lagTime;

    @JacksonXmlProperty(localName = "alertcause")
    private String alertCause;

    public LagDto(String userStopCode, Integer passageSequenceNumber, Integer lagTime, String alertCause) {
        this.userStopCode = userStopCode;
        this.passageSequenceNumber = passageSequenceNumber;
        this.lagTime = lagTime;
        this.alertCause = alertCause;
    }

    public LagDto() {
    }

    public String getUserStopCode() {
        return userStopCode;
    }

    public void setUserStopCode(String userStopCode) {
        this.userStopCode = userStopCode;
    }

    public Integer getPassageSequenceNumber() {
        return passageSequenceNumber;
    }

    public void setPassageSequenceNumber(Integer passageSequenceNumber) {
        this.passageSequenceNumber = passageSequenceNumber;
    }

    public Integer getLagTime() {
        return lagTime;
    }

    public void setLagTime(Integer lagTime) {
        this.lagTime = lagTime;
    }

    public String getAlertCause() {
        return alertCause;
    }

    public void setAlertCause(String alertCause) {
        this.alertCause = alertCause;
    }
}
