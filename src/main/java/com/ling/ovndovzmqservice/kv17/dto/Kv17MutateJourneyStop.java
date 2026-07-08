package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

public class Kv17MutateJourneyStop {

    @JacksonXmlProperty(localName = "timestamp")
    private String timestamp;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "SHORTEN")
    private List<Shorten> shorten = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "CHANGEPASSTIMES")
    private List<ChangePassTimes> changePassTimes = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "CHANGEDESTINATION")
    private List<ChangeDestination> changeDestination = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "LAG")
    private List<LagDto> lag = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "MUTATIONMESSAGE")
    private List<MutationMessage> mutationMessage = new ArrayList<>();

    public Kv17MutateJourneyStop() {
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Kv17MutateJourneyStop(String timestamp, List<Shorten> shorten, List<ChangePassTimes> changePassTimes, List<ChangeDestination> changeDestination, List<LagDto> lag, List<MutationMessage> mutationMessage) {
        this.timestamp = timestamp;
        this.shorten = shorten;
        this.changePassTimes = changePassTimes;
        this.changeDestination = changeDestination;
        this.lag = lag;
        this.mutationMessage = mutationMessage;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Shorten> getShorten() {
        return shorten;
    }

    public void setShorten(List<Shorten> shorten) {
        this.shorten = shorten;
    }

    public List<ChangePassTimes> getChangePassTimes() {
        return changePassTimes;
    }

    public void setChangePassTimes(List<ChangePassTimes> changePassTimes) {
        this.changePassTimes = changePassTimes;
    }

    public List<ChangeDestination> getChangeDestination() {
        return changeDestination;
    }

    public void setChangeDestination(List<ChangeDestination> changeDestination) {
        this.changeDestination = changeDestination;
    }

    public List<LagDto> getLag() {
        return lag;
    }

    public void setLag(List<LagDto> lag) {
        this.lag = lag;
    }

    public List<MutationMessage> getMutationMessage() {
        return mutationMessage;
    }

    public void setMutationMessage(List<MutationMessage> mutationMessage) {
        this.mutationMessage = mutationMessage;
    }
}
