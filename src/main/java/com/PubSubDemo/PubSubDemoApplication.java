package com.PubSubDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.cloud.spring.autoconfigure.pubsub.health.PubSubHealthIndicatorAutoConfiguration;
import com.google.cloud.spring.autoconfigure.pubsub.health.PubSubHealthIndicatorProperties;

@SpringBootApplication
public class PubSubDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubSubDemoApplication.class, args);
	}
	
	/*@Bean
	public PubSubHealthIndicatorAutoConfiguration pubSubHealthContributor() {
		return new PubSubHealthIndicatorAutoConfiguration(new PubSubHealthIndicatorProperties());
	}
	*/
}
