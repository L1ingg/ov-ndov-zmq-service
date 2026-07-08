package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SHORTEN")
public class Shorten {

    @JacksonXmlProperty(localName = "userstopcode")
    private String userStopCode;

    @JacksonXmlProperty(localName = "passagesequencenumber")
    private Integer passageSequenceNumber;

    @JacksonXmlProperty(localName = "showcancelledtrip")
    private Boolean showCancelledTrip;

    @JacksonXmlProperty(localName = "alertcause")
    private String alertCause;

    @JacksonXmlProperty(localName = "servicecondition")
    private String serviceCondition;

    @JacksonXmlProperty(localName = "serviceref")
    private String serviceRef;

    public Shorten(String userStopCode, Integer passageSequenceNumber, Boolean showCancelledTrip, String alertCause, String serviceCondition, String serviceRef) {
        this.userStopCode = userStopCode;
        this.passageSequenceNumber = passageSequenceNumber;
        this.showCancelledTrip = showCancelledTrip;
        this.alertCause = alertCause;
        this.serviceCondition = serviceCondition;
        this.serviceRef = serviceRef;
    }

    public Shorten() {
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

    public Boolean getShowCancelledTrip() {
        return showCancelledTrip;
    }

    public void setShowCancelledTrip(Boolean showCancelledTrip) {
        this.showCancelledTrip = showCancelledTrip;
    }

    public String getAlertCause() {
        return alertCause;
    }

    public void setAlertCause(String alertCause) {
        this.alertCause = alertCause;
    }

    public String getServiceCondition() {
        return serviceCondition;
    }

    public void setServiceCondition(String serviceCondition) {
        this.serviceCondition = serviceCondition;
    }

    public String getServiceRef() {
        return serviceRef;
    }

    public void setServiceRef(String serviceRef) {
        this.serviceRef = serviceRef;
    }
}