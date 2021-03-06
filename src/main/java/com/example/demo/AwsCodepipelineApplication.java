package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCodepipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodepipelineApplication.class, args);
	}
	
	
	
	private static final Logger log = LoggerFactory.getLogger(AwsCodepipelineApplication.class);

	
	@GetMapping("/")
	public String Basedata() {
		log.info("Application running successfully");
		return "service is up and running";
	}

}
