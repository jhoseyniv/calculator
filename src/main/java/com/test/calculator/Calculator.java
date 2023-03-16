package com.test.calculator;


import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public long sum(long a , long b){
        return  a+b;
    }
}
