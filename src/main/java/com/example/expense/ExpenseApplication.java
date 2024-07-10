package com.example.expense;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseApplication {
	private static final Logger logger = LoggerFactory.getLogger(ExpenseApplication.class);
	public static void main(String[] args) {

		try {
			SpringApplication.run(ExpenseApplication.class, args);
		} catch (Exception e) {
			logger.error("Application failed to start: ", e);
			System.exit(1);
		}
	}

}
