package com.employee.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.cloud.spring.pubsub.support.converter.JacksonPubSubMessageConverter;
import com.google.pubsub.v1.ProjectTopicName;
import com.google.pubsub.v1.PubsubMessage;

//@MessagingGateway(name="myPubSubGateway", defaultRequestChannel = "outboundMsgChanel")
@Service
public class PubSubImpl implements PubSubIf{

	@Autowired
	private JacksonPubSubMessageConverter jacksonPubSubMessageConverte;
	
	@Autowired
	private PubSubTemplate pubSubTemplate;
	
	public <T> void sendMsgToPubSubb(String topic, T msg) {
		publishMessageToPub(topic, msg);
		
	}
	
	private <T>void publishMessageToPub(String topic, T msg) {
		String topicname= ProjectTopicName.format("valid-might-365117", topic);
		PubsubMessage pubSubMessage = jacksonPubSubMessageConverte.toPubSubMessage(msg, null);
		pubSubTemplate.publish(topicname, pubSubMessage);
	}
	
	
	
	
}
