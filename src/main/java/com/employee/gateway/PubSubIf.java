package com.employee.gateway;

import org.springframework.stereotype.Component;

@Component
public interface PubSubIf {	
	<T> void sendMsgToPubSubb(String topicName,T msg);
	
	/*void sendMsgToPubSub(String topicName, String msg);
	
	void sendMsgToPubSub(String topicName,Emloyee msg);
	*/

	
	//void sendMsgToPubSubTemp(@Payload Emloyee msg, @Header("Subhankar Project : ") String projectId, @Header("GGG2")  String topic);
}
