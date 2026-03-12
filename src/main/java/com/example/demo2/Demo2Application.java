package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		System.out.println("Hello from branch 2 considering branch 1");
		System.out.println("bad commit");
		SpringApplication.run(Demo2Application.class, args);
	}

}
