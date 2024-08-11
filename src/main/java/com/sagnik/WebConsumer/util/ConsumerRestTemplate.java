package com.sagnik.WebConsumer.util;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class ConsumerRestTemplate {
	RestTemplate restTemplate;
	
	public ConsumerRestTemplate() {
		this.restTemplate = new RestTemplate();
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	

}
