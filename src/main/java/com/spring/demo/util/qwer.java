package com.spring.demo.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class qwer {

    private static final int HASH_INCREMENT = 0x61c88647;

    //DateTimeFormatter dtf=  new DateTimeFormatter("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
     /*   int abs = Math.abs(2 - 1);
        System.out.println(abs);
        float deltaRatioMin = Float.MAX_VALUE;
        System.out.println(deltaRatioMin);*/
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String format = Instant.now().atZone(ZoneId.systemDefault()).format(dateTimeFormatter);
        System.out.println(format);
    }

    public TestIntface get(){

        return (name) -> {

        };
    }

}
