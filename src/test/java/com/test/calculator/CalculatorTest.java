package com.test.calculator;


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        assertEquals(5,calculator.sum(2,3));
    }

    @Test
    public void testSum_2(){
        assertNotEquals(5,calculator.sum(20,3));
    }

//   @TestFactory
//    Collection<DynamicTest> dynamicTestCollection(){
//        return Arrays.asList(
//                DynamicTest.dynamicTest("1 test sum :",()-> assertEquals(6,calculator.sum(3,3))),
//                DynamicTest.dynamicTest("2 test sum :",()-> assertEquals(14,calculator.sum(13,1)))
//
//        );
//    }
}
