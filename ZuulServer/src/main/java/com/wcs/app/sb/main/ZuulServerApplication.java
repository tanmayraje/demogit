package com.wcs.app.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZuulServerApplication {

	public static void main(String[] args) {
		System.out.println("start");
		
		
		SpringApplication.run(ZuulServerApplication.class, args);
	
		System.out.println("end");
		
	}

}
