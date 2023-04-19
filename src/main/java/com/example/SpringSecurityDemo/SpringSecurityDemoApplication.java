package com.example.SpringSecurityDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityDemoApplication {

	public static void main(String[] args) {
		System.out.println("called");
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
		System.out.println("called 2");
	}

}
