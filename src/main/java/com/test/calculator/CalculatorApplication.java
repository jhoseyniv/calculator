package com.test.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	private static final String CONSTANT = "ALL";
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
