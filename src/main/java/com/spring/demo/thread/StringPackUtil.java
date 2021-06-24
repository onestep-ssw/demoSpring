package com.spring.demo.thread;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ssw
 * @description
 * @date 2021/3/26
 */

public class StringPackUtil {

    public static Boolean isBlack(String ... arg){
        for (String s:
        arg) {

            if (StringUtils.isBlank(s))
                return true;
        }
        return false;
    }

    public static String  replaceAllSpace(String val){
        return val.replaceAll(" ","");
    }
}
