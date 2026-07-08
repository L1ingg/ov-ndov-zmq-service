package com.ling.ovndovzmqservice.kv6.dto.events;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.ling.ovndovzmqservice.kv6.dto.Kv6Event;
import com.ling.ovndovzmqservice.kv6.dto.Kv6Type;

@JacksonXmlRootElement(localName = "ARRIVAL")
public class Arrival extends Kv6Event {
    @Override
    public Kv6Type getType() {
        return Kv6Type.ARRIVAL;
    }
}
