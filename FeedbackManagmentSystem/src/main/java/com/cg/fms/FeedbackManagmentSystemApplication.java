package com.cg.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FeedbackManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackManagmentSystemApplication.class, args);
	}

}
