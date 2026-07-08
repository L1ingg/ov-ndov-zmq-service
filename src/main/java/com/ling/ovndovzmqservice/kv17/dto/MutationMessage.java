package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "MUTATIONMESSAGE")
public class MutationMessage {

    @JacksonXmlProperty(localName = "userstopcode")
    private String userStopCode;

    @JacksonXmlProperty(localName = "passagesequencenumber")
    private Integer passageSequenceNumber;

    @JacksonXmlProperty(localName = "reasontype")
    private Integer reasonType;

    @JacksonXmlProperty(localName = "subreasontype")
    private String subReasonType;

    @JacksonXmlProperty(localName = "reasoncontent")
    private String reasonContent;

    @JacksonXmlProperty(localName = "advicetype")
    private Integer adviceType;

    @JacksonXmlProperty(localName = "subadvicetype")
    private String subAdviceType;

    @JacksonXmlProperty(localName = "advicecontent")
    private String adviceContent;

    @JacksonXmlProperty(localName = "showcancelledtrip")
    private Boolean showCancelledTrip;

    public MutationMessage(String userStopCode, Integer passageSequenceNumber, Integer reasonType, String subReasonType, String reasonContent, Integer adviceType, String subAdviceType, String adviceContent, Boolean showCancelledTrip) {
        this.userStopCode = userStopCode;
        this.passageSequenceNumber = passageSequenceNumber;
        this.reasonType = reasonType;
        this.subReasonType = subReasonType;
        this.reasonContent = reasonContent;
        this.adviceType = adviceType;
        this.subAdviceType = subAdviceType;
        this.adviceContent = adviceContent;
        this.showCancelledTrip = showCancelledTrip;
    }

    public MutationMessage() {
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

    public Integer getReasonType() {
        return reasonType;
    }

    public void setReasonType(Integer reasonType) {
        this.reasonType = reasonType;
    }

    public String getSubReasonType() {
        return subReasonType;
    }

    public void setSubReasonType(String subReasonType) {
        this.subReasonType = subReasonType;
    }

    public String getReasonContent() {
        return reasonContent;
    }

    public void setReasonContent(String reasonContent) {
        this.reasonContent = reasonContent;
    }

    public Integer getAdviceType() {
        return adviceType;
    }

    public void setAdviceType(Integer adviceType) {
        this.adviceType = adviceType;
    }

    public String getSubAdviceType() {
        return subAdviceType;
    }

    public void setSubAdviceType(String subAdviceType) {
        this.subAdviceType = subAdviceType;
    }

    public String getAdviceContent() {
        return adviceContent;
    }

    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent;
    }

    public Boolean getShowCancelledTrip() {
        return showCancelledTrip;
    }

    public void setShowCancelledTrip(Boolean showCancelledTrip) {
        this.showCancelledTrip = showCancelledTrip;
    }
}
