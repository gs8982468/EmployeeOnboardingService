package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.DTO.Emloyee;
import com.employee.gateway.PubSubIf;

@Component
@RestController
public class PublishController {
	
	@Autowired
	private PubSubIf PubSubIf;
	
	
	@PostMapping("/publishMessage")
	public String publishMessage(@RequestBody String msg) {
		PubSubIf.sendMsgToPubSubb("PubSubStringOnly", msg);
		return "Following Message sent to PubSub successfully : "+msg;
	}
	
	@PostMapping("/publish/Message")
	public String publishMessages(@RequestBody Emloyee employee) {
		PubSubIf.sendMsgToPubSubb("PubSubStringOnly", employee);
		return "Following Employee details sent to PubSub successfully : " + employee.getEmployeeName();
	}
	
	@PostMapping("/publish/Message/1")
	public String publishMessagess(@RequestBody Emloyee employee) {
		PubSubIf.sendMsgToPubSubb("PubSubStringOnly", employee);
		return "Following Employee Json sent to PubSub successfully :  "+ employee.getEmployeeName();
	}


}
