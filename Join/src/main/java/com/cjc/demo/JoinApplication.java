package com.cjc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoinApplication {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		
		SpringApplication.run(JoinApplication.class, args);
	
		System.out.println("end");
	}

}
