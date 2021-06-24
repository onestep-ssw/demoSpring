package com.spring.demo.util;

import org.springframework.stereotype.Component;

/**
 * @author ssw
 * @description
 * @date 2021/5/27
 */

@Component
public class TestBeans {

    public Integer print(){
        System.out.println("输出了");
        return 2;
    }
}
