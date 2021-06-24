package com.spring.demo.server;

import org.springframework.stereotype.Service;

/**
 * @author ssw
 * @description
 * @date 2021/6/15
 */

@Service
public class TestServer {



    public String testMethod(){
        return "2";
    }

    public String testMethod2(){
        return null;
    }

    public String getData(Integer one,String two){

        return null;
    }
}
