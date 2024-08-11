package com.sagnik.WebConsumer.util;

import org.springframework.web.reactive.function.client.WebClient;

public class WebClientTemplate {
	
	WebClient webClient;
	
	public WebClientTemplate() {
		webClient = WebClient.builder().build();
	}
	
	public WebClient getWebClient() {
		return this.webClient;
	}
	
	

}
