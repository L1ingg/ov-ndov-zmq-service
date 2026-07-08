package com.ling.ovndovzmqservice.kv6.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ling.ovndovzmqservice.kv6.dto.events.*;

import java.util.ArrayList;
import java.util.List;

public class Kv6Payload {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "ONSTOP")
    private List<OnStop> onStop = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "ONROUTE")
    private List<OnRoute> onRoute = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "ARRIVAL")
    private List<Arrival> arrival = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "DEPARTURE")
    private List<Departure> departure = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "OFFROUTE")
    private List<OffRoute> offRoute = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "INIT")
    private List<Init> init = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "END")
    private List<End> end = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "DELAY")
    private List<Delay> delay = new ArrayList<>();

    public Kv6Payload() {
    }

    public List<Kv6Event> getAll() {
        List<Kv6Event> all = new ArrayList<>();
        all.addAll(delay);
        all.addAll(end);
        all.addAll(init);
        all.addAll(offRoute);
        all.addAll(departure);
        all.addAll(arrival);
        all.addAll(onRoute);
        all.addAll(onStop);
        return all;
    }

    public List<OnStop> getOnStop() {
        return onStop;
    }

    public void setOnStop(List<OnStop> onStop) {
        this.onStop = onStop;
    }

    public List<OnRoute> getOnRoute() {
        return onRoute;
    }

    public void setOnRoute(List<OnRoute> onRoute) {
        this.onRoute = onRoute;
    }

    public List<Arrival> getArrival() {
        return arrival;
    }

    public void setArrival(List<Arrival> arrival) {
        this.arrival = arrival;
    }

    public List<Departure> getDeparture() {
        return departure;
    }

    public void setDeparture(List<Departure> departure) {
        this.departure = departure;
    }

    public List<OffRoute> getOffRoute() {
        return offRoute;
    }

    public void setOffRoute(List<OffRoute> offRoute) {
        this.offRoute = offRoute;
    }

    public List<Init> getInit() {
        return init;
    }

    public void setInit(List<Init> init) {
        this.init = init;
    }

    public List<End> getEnd() {
        return end;
    }

    public void setEnd(List<End> end) {
        this.end = end;
    }

    public List<Delay> getDelay() {
        return delay;
    }

    public void setDelay(List<Delay> delay) {
        this.delay = delay;
    }
}