package com.leo.cart.core.commons;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component("jsonMapper")
public class JsonMapper {

	private static final ObjectMapper om = new ObjectMapper();
	
	public String objectToString(Object o) throws JsonProcessingException{
		return om.writeValueAsString(o);
	}
}
