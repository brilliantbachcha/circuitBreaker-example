package com.sagnik.WebConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagnik.WebConsumer.service.HelloConsumerService;

@RestController
@RequestMapping("/hello")
public class HelloConsumerController {
	@Autowired
	HelloConsumerService helloConsumerService;
	
	@GetMapping(path = "/{user}")
	String consumeHello(@PathVariable String user) {
		String response = helloConsumerService.consumeHello(user);
		return response;
	}

}
