package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CHANGEDESTINATION")
public class ChangeDestination {

    @JacksonXmlProperty(localName = "userstopcode")
    private String userStopCode;

    @JacksonXmlProperty(localName = "passagesequencenumber")
    private Integer passageSequenceNumber;

    @JacksonXmlProperty(localName = "destinationcode")
    private String destinationCode;

    @JacksonXmlProperty(localName = "destinationname50")
    private String destinationName50;

    @JacksonXmlProperty(localName = "destinationname16")
    private String destinationName16;

    @JacksonXmlProperty(localName = "destinationdetail16")
    private String destinationDetail16;

    @JacksonXmlProperty(localName = "destinationdisplay16")
    private String destinationDisplay16;

    public ChangeDestination() {
    }

    public ChangeDestination(String userStopCode, Integer passageSequenceNumber, String destinationCode, String destinationName50, String destinationName16, String destinationDetail16, String destinationDisplay16) {
        this.userStopCode = userStopCode;
        this.passageSequenceNumber = passageSequenceNumber;
        this.destinationCode = destinationCode;
        this.destinationName50 = destinationName50;
        this.destinationName16 = destinationName16;
        this.destinationDetail16 = destinationDetail16;
        this.destinationDisplay16 = destinationDisplay16;
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

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getDestinationName50() {
        return destinationName50;
    }

    public void setDestinationName50(String destinationName50) {
        this.destinationName50 = destinationName50;
    }

    public String getDestinationName16() {
        return destinationName16;
    }

    public void setDestinationName16(String destinationName16) {
        this.destinationName16 = destinationName16;
    }

    public String getDestinationDetail16() {
        return destinationDetail16;
    }

    public void setDestinationDetail16(String destinationDetail16) {
        this.destinationDetail16 = destinationDetail16;
    }

    public String getDestinationDisplay16() {
        return destinationDisplay16;
    }

    public void setDestinationDisplay16(String destinationDisplay16) {
        this.destinationDisplay16 = destinationDisplay16;
    }
}
