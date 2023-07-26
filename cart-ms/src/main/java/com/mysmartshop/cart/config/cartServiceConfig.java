package com.mysmartshop.cart.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class cartServiceConfig {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		RestTemplate restClient = new RestTemplate();
		return restClient;
	}
}
