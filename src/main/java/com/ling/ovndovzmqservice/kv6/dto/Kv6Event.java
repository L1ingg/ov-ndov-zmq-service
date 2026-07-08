package com.ling.ovndovzmqservice.kv6.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public abstract class Kv6Event {
    private final Kv6Type type = getType();

    @JacksonXmlProperty(localName = "dataownercode")
    private String dataOwnerCode;

    @JacksonXmlProperty(localName = "lineplanningnumber")
    private String linePlanningNumber;

    @JacksonXmlProperty(localName = "operatingday")
    private String operatingDay;

    @JacksonXmlProperty(localName = "journeynumber")
    private Integer journeyNumber;

    @JacksonXmlProperty(localName = "reinforcementnumber")
    private Integer reinforcementNumber;

    @JacksonXmlProperty(localName = "timestamp")
    private String timestamp;

    @JacksonXmlProperty(localName = "source")
    private String source;

    @JacksonXmlProperty(localName = "userstopcode")
    private String userStopCode;

    @JacksonXmlProperty(localName = "passagesequencenumber")
    private Integer passageSequenceNumber;

    @JacksonXmlProperty(localName = "vehiclenumber")
    private String vehicleNumber;

    @JacksonXmlProperty(localName = "punctuality")
    private Integer punctuality;

    @JacksonXmlProperty(localName = "distancesincelastuserstop")
    private Integer distanceSinceLastUserStop;

    @JacksonXmlProperty(localName = "distancesincelaststop")
    private Integer distanceSinceLastStop;

    @JacksonXmlProperty(localName = "rd-x")
    private Integer rdX;

    @JacksonXmlProperty(localName = "rd-y")
    private Integer rdY;

    @JacksonXmlProperty(localName = "blockcode")
    private Long blockCode;

    @JacksonXmlProperty(localName = "wheelchairaccessible")
    private Boolean wheelchairAccessible;

    @JacksonXmlProperty(localName = "numberofcoaches")
    private Integer numberOfCoaches;

    public Kv6Event() {
    }

    public Kv6Event(String dataOwnerCode, String linePlanningNumber, String operatingDay, Integer journeyNumber, Integer reinforcementNumber, String timestamp, String source, String userStopCode, Integer passageSequenceNumber, String vehicleNumber, Integer punctuality, Integer distanceSinceLastUserStop, Integer distanceSinceLastStop, Integer rdX, Integer rdY, Long blockCode, Boolean wheelchairAccessible, Integer numberOfCoaches) {
        this.dataOwnerCode = dataOwnerCode;
        this.linePlanningNumber = linePlanningNumber;
        this.operatingDay = operatingDay;
        this.journeyNumber = journeyNumber;
        this.reinforcementNumber = reinforcementNumber;
        this.timestamp = timestamp;
        this.source = source;
        this.userStopCode = userStopCode;
        this.passageSequenceNumber = passageSequenceNumber;
        this.vehicleNumber = vehicleNumber;
        this.punctuality = punctuality;
        this.distanceSinceLastUserStop = distanceSinceLastUserStop;
        this.distanceSinceLastStop = distanceSinceLastStop;
        this.rdX = rdX;
        this.rdY = rdY;
        this.blockCode = blockCode;
        this.wheelchairAccessible = wheelchairAccessible;
        this.numberOfCoaches = numberOfCoaches;
    }

    public abstract Kv6Type getType();

    public String getDataOwnerCode() {
        return dataOwnerCode;
    }

    public void setDataOwnerCode(String dataOwnerCode) {
        this.dataOwnerCode = dataOwnerCode;
    }

    public String getLinePlanningNumber() {
        return linePlanningNumber;
    }

    public void setLinePlanningNumber(String linePlanningNumber) {
        this.linePlanningNumber = linePlanningNumber;
    }

    public String getOperatingDay() {
        return operatingDay;
    }

    public void setOperatingDay(String operatingDay) {
        this.operatingDay = operatingDay;
    }

    public Integer getJourneyNumber() {
        return journeyNumber;
    }

    public void setJourneyNumber(Integer journeyNumber) {
        this.journeyNumber = journeyNumber;
    }

    public Integer getReinforcementNumber() {
        return reinforcementNumber;
    }

    public void setReinforcementNumber(Integer reinforcementNumber) {
        this.reinforcementNumber = reinforcementNumber;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(Integer punctuality) {
        this.punctuality = punctuality;
    }

    public Integer getDistanceSinceLastUserStop() {
        return distanceSinceLastUserStop;
    }

    public void setDistanceSinceLastUserStop(Integer distanceSinceLastUserStop) {
        this.distanceSinceLastUserStop = distanceSinceLastUserStop;
    }

    public Integer getDistanceSinceLastStop() {
        return distanceSinceLastStop;
    }

    public void setDistanceSinceLastStop(Integer distanceSinceLastStop) {
        this.distanceSinceLastStop = distanceSinceLastStop;
    }

    public Integer getRdX() {
        return rdX;
    }

    public void setRdX(Integer rdX) {
        this.rdX = rdX;
    }

    public Integer getRdY() {
        return rdY;
    }

    public void setRdY(Integer rdY) {
        this.rdY = rdY;
    }

    public Long getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(Long blockCode) {
        this.blockCode = blockCode;
    }

    public Boolean getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public void setWheelchairAccessible(Boolean wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }

    public Integer getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(Integer numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }
}















