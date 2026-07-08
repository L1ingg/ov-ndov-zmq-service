package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CHANGEPASSTIMES")
public class ChangePassTimes {

    @JacksonXmlProperty(localName = "userstopcode")
    private String userStopCode;

    @JacksonXmlProperty(localName = "passagesequencenumber")
    private Integer passageSequenceNumber;

    @JacksonXmlProperty(localName = "targetarrivaltime")
    private String targetArrivalTime;

    @JacksonXmlProperty(localName = "targetdeparturetime")
    private String targetDepartureTime;

    @JacksonXmlProperty(localName = "journeystoptype")
    private String journeyStopType;

    public ChangePassTimes(String userStopCode, Integer passageSequenceNumber, String targetArrivalTime, String targetDepartureTime, String journeyStopType) {
        this.userStopCode = userStopCode;
        this.passageSequenceNumber = passageSequenceNumber;
        this.targetArrivalTime = targetArrivalTime;
        this.targetDepartureTime = targetDepartureTime;
        this.journeyStopType = journeyStopType;
    }

    public ChangePassTimes() {
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

    public String getTargetArrivalTime() {
        return targetArrivalTime;
    }

    public void setTargetArrivalTime(String targetArrivalTime) {
        this.targetArrivalTime = targetArrivalTime;
    }

    public String getTargetDepartureTime() {
        return targetDepartureTime;
    }

    public void setTargetDepartureTime(String targetDepartureTime) {
        this.targetDepartureTime = targetDepartureTime;
    }

    public String getJourneyStopType() {
        return journeyStopType;
    }

    public void setJourneyStopType(String journeyStopType) {
        this.journeyStopType = journeyStopType;
    }
}
