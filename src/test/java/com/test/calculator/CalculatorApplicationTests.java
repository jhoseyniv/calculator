package com.test.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {
	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
		assertEquals(6,calculator.sum(1,3));
		assertEquals(5000,calculator.sum(3000,2000));
		assertEquals(75,calculator.sum(74,1));
		assertEquals(50,calculator.sum(51,-1));
	}

}
