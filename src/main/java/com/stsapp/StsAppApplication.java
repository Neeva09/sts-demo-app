package com.stsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StsAppApplication.class, args);
		System.out.println("TomcatWebServer started");
	}

}
