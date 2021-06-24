package com.spring.demo.server;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ssw
 * @description
 * @date 2021/6/15
 */

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class TestServerTest {


    @Mock
    TestServer testServer;


    @Test
    public void testMethod(){
        String s = testServer.testMethod();
        Assert.assertNotNull(s);
        String s1 = testServer.testMethod2();
        Assert.assertNotNull(s1);
    }
}
