package com.sagnik.WebConsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sagnik.WebConsumer.util.ConsumerRestTemplate;
import com.sagnik.WebConsumer.util.WebClientTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class HelloConsumerService {
	@Autowired
	ConsumerRestTemplate consumerRestTemplate;
	WebClientTemplate webClientTemplate;
	
	@CircuitBreaker(name = "HelloConsumerCircuitBreaker", fallbackMethod = "fallBackMethod")
	public String consumeHello(String user) {
		String url = "http://localhost:8088/hello?user=";
		url = url.concat(user);
		ResponseEntity<String>respEntity = consumerRestTemplate.getRestTemplate().getForEntity(url, String.class);
		
		return respEntity.getBody();
	}
	
	String fallBackMethod(String user,Throwable th) {
		return ("Unable to connect to producer for request "+ user);
	}

}
