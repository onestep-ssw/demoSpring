package com.spring.demo;

import com.spring.demo.config.JwtConfig;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    JwtConfig jwtConfig;
    @Test
    void contextLoads() {
        String x = jwtConfig.createToken("小明");
        System.out.println(x);
        Claims tokenClaim = jwtConfig.getTokenClaim(x);
        String subject = tokenClaim.getSubject();
        System.out.println(tokenClaim);
    }

}
