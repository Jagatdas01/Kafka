package com.spring.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring.kafka.model.Message;

@Service
public class Consumer {
	@KafkaListener(topics = "jagat2", groupId = "jex")
	public void listen(Message message) {
	    System.out.println("Received Messasge in group fooddd: " + message);
	}
}
