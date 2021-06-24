package com.spring.demo;

import com.spring.demo.util.TestBeans;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @author ssw
 * @description
 * @date 2021/5/27
 */

@SpringBootTest
@AutoConfigureMockMvc
public class ThisTestUnit {

    @Autowired
    TestBeans testBeans;
    @Autowired
    private TestRestTemplate template;
    @Autowired
    MockMvc mockMvc;

    @Test
    public void pr(){
        Integer print = testBeans.print();
    }
}
