package com.spring.demo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author ssw
 * @description
 * @date 2021/5/12
 */

public class Demo23 {


    public static void main(String[] args) {

        //$2a$10$wkuyVmE5u52einNgVnbJHuLwLW6AsNrW23JZrauRo93nCyg5tzEwG
        //adminJson();
    }


    public static void  zlbPassword(){
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("A@13A#@896");
        System.out.println(encode);
    }
    private  static JSONObject adminJson(){
        JSONObject extendValue = new JSONObject();
        extendValue.put("label","是");
        extendValue.put("key","option_0");

        JSONObject extendValueParent = new JSONObject();
        extendValueParent.put("extendValue",extendValue);
        extendValueParent.put("value","是");

        JSONObject dd = new JSONObject();
        dd.put("DDSelectField_KM4YKL2K",extendValueParent);
        System.out.println(dd.toJSONString());
        return null;
    }
}
