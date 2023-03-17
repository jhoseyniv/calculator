package com.test.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    public Calculator calculator;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping(path="/sum")
    String sum(@RequestParam("a") int a,@RequestParam("b") int b) {
        long sumValue = calculator.sum(a, b);
        return String.valueOf(sumValue);
        //return "30";
    }

}
