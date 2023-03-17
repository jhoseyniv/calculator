package com.test.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorApplicationTests {

    @Autowired
    private MockMvc mvc;

   @MockBean
    public Calculator calculator;

   // private Calculator calculator2 = new Calculator();

//    @Test
//    public void testCalculatorSum(){
//        assertEquals(6,calculator2.sum(30,3));
//        assertEquals(5000,calculator2.sum(3000,2000));
//        assertEquals(75,calculator2.sum(74,1));
//
//    }
    @Test
    public void testHelloWorldFunction() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World!")));

    }



}