package com.ling.ovndovzmqservice.kv15.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.ArrayList;
import java.util.List;

public class LinePlanningNumbers {

    @JacksonXmlProperty(localName = "lineplanningnumber")
    private List<String> linePlanningNumber = new ArrayList<>();

    public List<String> getLinePlanningNumber() {
        return linePlanningNumber;
    }

    public void setLinePlanningNumber(List<String> linePlanningNumber) {
        this.linePlanningNumber = linePlanningNumber;
    }
}