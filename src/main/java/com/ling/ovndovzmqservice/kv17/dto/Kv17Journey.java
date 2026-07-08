package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Kv17Journey {

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

    @JacksonXmlProperty(localName = "allJourneysOfLine")
    private Boolean allJourneysOfLine;

    @JacksonXmlProperty(localName = "allLines")
    private Boolean allLines;

    @JacksonXmlProperty(localName = "begintime")
    private String beginTime;

    @JacksonXmlProperty(localName = "endtime")
    private String endTime;

    public Kv17Journey() {
    }

    public Kv17Journey(String dataOwnerCode, String linePlanningNumber, String operatingDay, Integer journeyNumber, Integer reinforcementNumber, Boolean allJourneysOfLine, Boolean allLines, String beginTime, String endTime) {
        this.dataOwnerCode = dataOwnerCode;
        this.linePlanningNumber = linePlanningNumber;
        this.operatingDay = operatingDay;
        this.journeyNumber = journeyNumber;
        this.reinforcementNumber = reinforcementNumber;
        this.allJourneysOfLine = allJourneysOfLine;
        this.allLines = allLines;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

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

    public Boolean getAllJourneysOfLine() {
        return allJourneysOfLine;
    }

    public void setAllJourneysOfLine(Boolean allJourneysOfLine) {
        this.allJourneysOfLine = allJourneysOfLine;
    }

    public Boolean getAllLines() {
        return allLines;
    }

    public void setAllLines(Boolean allLines) {
        this.allLines = allLines;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
