/*package com.PubSubDemo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.cloud.spring.pubsub.core.publisher.PubSubPublisherTemplate;
import com.google.cloud.spring.pubsub.core.subscriber.PubSubSubscriberTemplate;
import com.google.cloud.spring.pubsub.integration.outbound.PubSubMessageHandler;
import com.google.cloud.spring.pubsub.support.converter.JacksonPubSubMessageConverter;
import com.google.cloud.spring.pubsub.support.converter.PubSubMessageConverter;

@Component
public class PubConfiguration {
	
	@Bean
	public PubSubTemplate pubSubTemplate(PubSubPublisherTemplate pubSubPublisherTemplate, PubSubSubscriberTemplate pubTep) {
		return new PubSubTemplate(pubSubPublisherTemplate, pubTep);
	}

	@Bean
	@ServiceActivator(inputChannel = "outboundMsgChanel")
	public PubSubMessageHandler messageSender(PubSubTemplate pubsubtTemplate) {
		//return new PubSubMessageHandler(pubsubtTemplate, "PbSubDemo");
		return new PubSubMessageHandler(pubsubtTemplate, "PubSubStringOnly");
		
	}
	
	@Bean
	@Primary
	public PubSubMessageConverter pubSubMessageConverter(ObjectMapper objectMapper) {
	   return new JacksonPubSubMessageConverter(objectMapper);
	}
	
	@Bean
	@Primary
	public ObjectMapper objectMapper() {
	  ObjectMapper mapper = new ObjectMapper();
	  mapper.registerModule(new JavaTimeModule());
	  mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	  mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
	  mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	  return mapper;
	}

}
*/