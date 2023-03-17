package com.test.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorApplicationTests {

    @Autowired
    private MockMvc mvc;

   @Autowired
    public Calculator calculator;

    private Calculator calculator2 = new Calculator();

//    @Test
//    public void testCalculatorSum(){
//        assertEquals(33,calculator2.sum(30,3));
//        assertEquals(5000,calculator2.sum(3000,2000));
//        assertEquals(75,calculator2.sum(74,1));
//
//    }

    @Test
    public void whenSayHello_thenAccept() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World!")));
    }

    @Test
    public void whenSumIsCorrect_thenAccept() throws Exception {
        String uri = "/sum?a=10&b=20";

        mvc.perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.ALL_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("30")));
    }

    @Test
    public void whenSayHello_thenReject() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello2"))
                .andDo(print())
                .andExpect(status().is(404));
               // .andExpect(content().string(containsStringIgnoringCase("hello world222")));

    }



}
