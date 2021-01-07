package com.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

	//@SpringBootConfiguration
	//@EnableAutoConfiguration  //@Configuration
	//@ComponentScan

	//mvn clean spring-boot:run

	//https://www.getpostman.com/collections/a98de1705daaf7892d78

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);


	}

}
