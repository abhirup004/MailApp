package com.jbs.mailapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailappApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(MailappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MailappApplication.class, args);
		logger.info("=====================>>Springboot mailing application started...");
	}

}
