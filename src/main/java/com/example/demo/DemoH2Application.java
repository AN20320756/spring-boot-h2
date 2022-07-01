package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoH2Application {

	public static void main(String[] args) {
		
		System.out.println("hi");
		SpringApplication.run(DemoH2Application.class, args);
	}
	
}
