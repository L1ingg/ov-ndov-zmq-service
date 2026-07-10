package com.ling.ovndovzmqservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OvNdovZmqAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OvNdovZmqAdapterApplication.class, args);
	}

	@Bean
	public XmlMapper xmlMapper() {
		return new XmlMapper();
	}

	@Bean
	public ObjectMapper jsonMapper() {
		return new ObjectMapper();
	}
}
