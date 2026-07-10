package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Processor<T> {
    void process(String to, T t) throws JsonProcessingException;
}
