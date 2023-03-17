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
        return "Hello world!";
    }

    @GetMapping(path="/sum", produces = "application/json")
    String sum(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
