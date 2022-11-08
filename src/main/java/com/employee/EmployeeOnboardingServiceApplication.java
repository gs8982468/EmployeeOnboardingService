package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeOnboardingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeOnboardingServiceApplication.class, args);
	}
	
	/*@Bean
	public PubSubHealthIndicatorAutoConfiguration pubSubHealthContributor() {
		return new PubSubHealthIndicatorAutoConfiguration(new PubSubHealthIndicatorProperties());
	}
	*/
}
