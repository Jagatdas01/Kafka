package com.spring.kafka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.model.Message;

@RestController
@RequestMapping(path = "kafka")
public class Producer {
	@Autowired
	private KafkaTemplate<String,Message> kafkaTemplate;

	@GetMapping("/send/{name}")
	public String post(@PathVariable("name") final String name) {
		System.out.println("Inside Msg "+name);
		List<Message> mList = new ArrayList<>();
		mList.add(new Message("Hi","Jagat",null));
		mList.add(new Message("Bye","Kumar",null));
		Message m = new Message("First","try",mList);
		kafkaTemplate.send("jagat2", m);

		return "Published successfully";
	}

}
