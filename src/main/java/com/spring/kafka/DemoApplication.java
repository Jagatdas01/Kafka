package com.spring.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class DemoApplication {


	/* 
	* Seeb by swastik
	 */

	public static void main(String[] args) {
		System.out.println("seen by swastik");
		SpringApplication.run(DemoApplication.class, args);
	}

}
