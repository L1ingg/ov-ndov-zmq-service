package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

public class StopMessage {
    private final Kv15MessageType type = Kv15MessageType.STOP_MESSAGE;

    @JacksonXmlProperty(localName = "dataownercode")
    private String dataOwnerCode;

    @JacksonXmlProperty(localName = "messagecodedate")
    private String messageCodeDate;

    @JacksonXmlProperty(localName = "messagecodenumber")
    private Integer messageCodeNumber;

    @JacksonXmlElementWrapper(localName = "userstopcodes")
    @JacksonXmlProperty(localName = "userstopcode")
    private List<String> userStopCodes = new ArrayList<>();

    @JacksonXmlProperty(localName = "lineplanningnumbers")
    private LinePlanningNumbers linePlanningNumbers;

    @JacksonXmlProperty(localName = "messagepriority")
    private String messagePriority;

    @JacksonXmlProperty(localName = "messagetype")
    private DisplayType displayType;

    @JacksonXmlProperty(localName = "messagedurationtype")
    private String messageDurationType;

    @JacksonXmlProperty(localName = "messagestarttime")
    private String messageStartTime;

    @JacksonXmlProperty(localName = "messageendtime")
    private String messageEndTime;

    @JacksonXmlProperty(localName = "messagecontent")
    private String messageContent;

    @JacksonXmlProperty(localName = "reasoncontent")
    private String reasonContent;

    @JacksonXmlProperty(localName = "effectcontent")
    private String effectContent;

    @JacksonXmlProperty(localName = "measurecontent")
    private String measureContent;

    @JacksonXmlProperty(localName = "advicecontent")
    private String adviceContent;

    @JacksonXmlProperty(localName = "reasontype")
    private Integer reasonType;

    @JacksonXmlProperty(localName = "subreasontype")
    private String subReasonType;

    @JacksonXmlProperty(localName = "effecttype")
    private Integer effectType;

    @JacksonXmlProperty(localName = "subeffecttype")
    private String subEffectType;

    @JacksonXmlProperty(localName = "measuretype")
    private Integer measureType;

    @JacksonXmlProperty(localName = "submeasuretype")
    private String subMeasureType;

    @JacksonXmlProperty(localName = "advicetype")
    private Integer adviceType;

    @JacksonXmlProperty(localName = "subadvicetype")
    private String subAdviceType;

    @JacksonXmlProperty(localName = "messagetimestamp")
    private String messageTimestamp;

    @JacksonXmlProperty(localName = "messageurl")
    private String messageUrl;

    @JacksonXmlProperty(localName = "messagetitle")
    private MessageTitle messageTitle;

    @JacksonXmlProperty(localName = "showoverviewdisplay")
    private String showOverviewDisplay;

    public Kv15MessageType type() {
        return Kv15MessageType.STOP_MESSAGE;
    }

    public Kv15MessageType getType() {
        return type;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public String getDataOwnerCode() {
        return dataOwnerCode;
    }

    public String getMessageCodeDate() {
        return messageCodeDate;
    }

    public void setMessageCodeDate(String messageCodeDate) {
        this.messageCodeDate = messageCodeDate;
    }

    public Integer getMessageCodeNumber() {
        return messageCodeNumber;
    }

    public void setMessageCodeNumber(Integer messageCodeNumber) {
        this.messageCodeNumber = messageCodeNumber;
    }

    public List<String> getUserStopCodes() {
        return userStopCodes;
    }

    public void setUserStopCodes(List<String> userStopCodes) {
        this.userStopCodes = userStopCodes;
    }

    public LinePlanningNumbers getLinePlanningNumbers() {
        return linePlanningNumbers;
    }

    public void setLinePlanningNumbers(LinePlanningNumbers linePlanningNumbers) {
        this.linePlanningNumbers = linePlanningNumbers;
    }

    public String getMessagePriority() {
        return messagePriority;
    }

    public void setMessagePriority(String messagePriority) {
        this.messagePriority = messagePriority;
    }

    public DisplayType getMessageType() {
        return displayType;
    }

    public void setMessageType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public String getMessageDurationType() {
        return messageDurationType;
    }

    public void setMessageDurationType(String messageDurationType) {
        this.messageDurationType = messageDurationType;
    }

    public String getMessageStartTime() {
        return messageStartTime;
    }

    public void setMessageStartTime(String messageStartTime) {
        this.messageStartTime = messageStartTime;
    }

    public String getMessageEndTime() {
        return messageEndTime;
    }

    public void setMessageEndTime(String messageEndTime) {
        this.messageEndTime = messageEndTime;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getReasonContent() {
        return reasonContent;
    }

    public void setReasonContent(String reasonContent) {
        this.reasonContent = reasonContent;
    }

    public String getEffectContent() {
        return effectContent;
    }

    public void setEffectContent(String effectContent) {
        this.effectContent = effectContent;
    }

    public String getMeasureContent() {
        return measureContent;
    }

    public void setMeasureContent(String measureContent) {
        this.measureContent = measureContent;
    }

    public String getAdviceContent() {
        return adviceContent;
    }

    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent;
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

    public Integer getEffectType() {
        return effectType;
    }

    public void setEffectType(Integer effectType) {
        this.effectType = effectType;
    }

    public String getSubEffectType() {
        return subEffectType;
    }

    public void setSubEffectType(String subEffectType) {
        this.subEffectType = subEffectType;
    }

    public Integer getMeasureType() {
        return measureType;
    }

    public void setMeasureType(Integer measureType) {
        this.measureType = measureType;
    }

    public String getSubMeasureType() {
        return subMeasureType;
    }

    public void setSubMeasureType(String subMeasureType) {
        this.subMeasureType = subMeasureType;
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

    public String getMessageTimestamp() {
        return messageTimestamp;
    }

    public void setMessageTimestamp(String messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }

    public String getMessageUrl() {
        return messageUrl;
    }

    public void setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl;
    }

    public MessageTitle getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(MessageTitle messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getShowOverviewDisplay() {
        return showOverviewDisplay;
    }

    public void setShowOverviewDisplay(String showOverviewDisplay) {
        this.showOverviewDisplay = showOverviewDisplay;
    }

    public void setDataOwnerCode(String dataOwnerCode) {
        this.dataOwnerCode = dataOwnerCode;
    }
}