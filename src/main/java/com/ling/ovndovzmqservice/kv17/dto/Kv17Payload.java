package com.ling.ovndovzmqservice.kv17.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Kv17Payload {

    @JacksonXmlProperty(localName = "KV17JOURNEY")
    private Kv17Journey journey;

    @JacksonXmlProperty(localName = "KV17MUTATEJOURNEY")
    private Kv17MutateJourney mutateJourney;

    @JacksonXmlProperty(localName = "KV17MUTATEJOURNEYSTOP")
    private Kv17MutateJourneyStop mutateJourneyStop;

    public Kv17Payload() {
    }

    public Kv17Payload(Kv17Journey journey, Kv17MutateJourney mutateJourney, Kv17MutateJourneyStop mutateJourneyStop) {
        this.journey = journey;
        this.mutateJourney = mutateJourney;
        this.mutateJourneyStop = mutateJourneyStop;
    }

    public Kv17Journey getJourney() {
        return journey;
    }

    public void setJourney(Kv17Journey journey) {
        this.journey = journey;
    }

    public Kv17MutateJourney getMutateJourney() {
        return mutateJourney;
    }

    public void setMutateJourney(Kv17MutateJourney mutateJourney) {
        this.mutateJourney = mutateJourney;
    }

    public Kv17MutateJourneyStop getMutateJourneyStop() {
        return mutateJourneyStop;
    }

    public void setMutateJourneyStop(Kv17MutateJourneyStop mutateJourneyStop) {
        this.mutateJourneyStop = mutateJourneyStop;
    }
}