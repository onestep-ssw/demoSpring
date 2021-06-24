package com.spring.demo.util;

import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;

public class aa {


    public static void main(String[] args) {


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("customer_name","测试单位");
        jsonObject.put("TextareaField_KM5WYU3X","海智大厦");
        jsonObject.put("TextField_KM5WWHM8","6481247912847219");
        String s = jsonObject.toString();
        System.out.println(s);



        JSONObject json2 = new JSONObject();
        json2.put("contact_name","马强");
        json2.put("contact_phone","13222331133");


        JSONObject ins = new JSONObject();
        ins.put("instanceId","123123sdsad");
        JSONObject ev = new JSONObject();
        ev.put("quote",1);
        ev.put("list",Arrays.asList(ins));
        json2.put("extendValue",ev);
        json2.put("value",Arrays.asList("测试企业"));
        System.out.println(json2.toJSONString());
      /*  int[][] arr=new int[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(i+" "+j+"     ");
            }
            System.out.println();
        }*/
    }
}
