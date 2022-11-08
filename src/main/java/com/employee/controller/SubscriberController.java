package com.employee.controller;

import java.nio.charset.StandardCharsets;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {

	String message;

	@GetMapping("getMessage")
	public String getMessage() {
		return "Message from GCP " + message;
	}

	@ServiceActivator(inputChannel = "inputChannel")
	public void receiveMessage(final Message<byte[]> message) throws Exception {
		try {
			String messageString = new String(message.getPayload(), StandardCharsets.UTF_8);
			
			this.message = messageString;
		} catch (Exception e) {
			throw new Exception("Error while processing your request", e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	
/*	@Bean
	public PubSubInboundChannelAdapter messageAdapter(@Qualifier("inputChannel") MessageChannel inputChannel,
			PubSubTemplate template) {
		PubSubInboundChannelAdapter adapter = new PubSubInboundChannelAdapter(template, "PubSubStringOnly-sub");
		adapter.setOutputChannel(inputChannel);
		return adapter;
	}*/

	/*@Bean
	MessageChannel inputChannel() {
		return new DirectChannel();
	}*/

	
	/*@Bean
	@ServiceActivator(inputChannel = "inputChannel")
	public MessageHandler messageReceiver() {
		return message -> {
//			LOGGER.info("Message arrived! Payload: " + new String((byte[]) message.getPayload()));
			BasicAcknowledgeablePubsubMessage originalMessage = message.getHeaders()
					.get(GcpPubSubHeaders.ORIGINAL_MESSAGE, BasicAcknowledgeablePubsubMessage.class);
			originalMessage.ack();
		};
	}*/

}
