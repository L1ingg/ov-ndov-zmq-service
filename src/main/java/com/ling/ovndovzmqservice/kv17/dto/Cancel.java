package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CANCEL")
public class Cancel {

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

    @JacksonXmlProperty(localName = "autorecover")
    private Boolean autoRecover;

    @JacksonXmlProperty(localName = "alertcause")
    private String alertCause;

    @JacksonXmlProperty(localName = "servicecondition")
    private String serviceCondition;

    @JacksonXmlProperty(localName = "serviceref")
    private String serviceRef;

    public Cancel(Integer reasonType, String subReasonType, String reasonContent, Integer adviceType, String subAdviceType, String adviceContent, Boolean showCancelledTrip, Boolean autoRecover, String alertCause, String serviceCondition, String serviceRef) {
        this.reasonType = reasonType;
        this.subReasonType = subReasonType;
        this.reasonContent = reasonContent;
        this.adviceType = adviceType;
        this.subAdviceType = subAdviceType;
        this.adviceContent = adviceContent;
        this.showCancelledTrip = showCancelledTrip;
        this.autoRecover = autoRecover;
        this.alertCause = alertCause;
        this.serviceCondition = serviceCondition;
        this.serviceRef = serviceRef;
    }

    public Cancel() {
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

    public Boolean getAutoRecover() {
        return autoRecover;
    }

    public void setAutoRecover(Boolean autoRecover) {
        this.autoRecover = autoRecover;
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
