package com.spring.demo.test;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author ssw
 * @description
 * @date 2021/6/18
 */

public class DemoPa {

    public static void main(String[] args) {


        System.out.println( Math.round(-1.5));
        System.out.println( Math.round(1.5));
/*        String a="qwew";
        String reverse = StringUtils.reverse(a);
        System.out.println(reverse);*/
        String s = new StringBuffer("42321").reverse().toString();
        System.out.println(s);
        int n = 5 - 1;
        int j = (n-1) >> 1;
        System.out.println(j);
        String rev = rev("42321");
        String s1 = rev2("4232");
        System.out.println(rev);
        System.out.println(s1);
        System.out.println((5-2) >> 1);
        System.out.println(5/2-1);
        Object o = new Object();
        HashMap<Object, Integer> objectIntegerHashMap = new HashMap<>();
        objectIntegerHashMap.put(rev,2131);
        HashMap<Parent, Integer> parentIntegerHashMap = new HashMap<>();
        parentIntegerHashMap.put(new SonTwo(),1231);

        try {
            Class<?> aClass = Class.forName("com.spring.demo.server.impl.ServerInterfaceImplOne");
            Class<?> superclass = aClass.getSuperclass();
            System.out.println(superclass.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        LinkedList<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        String poll = strings.poll();
        System.out.println(strings.size());
        String remove = strings.remove();
        System.out.println(strings.size());
/*        System.out.println(poll);
        System.out.println(remove);*/
    }

    public static String rev(String str){
        int length = str.length();
        char[] value = str.toCharArray();
        int n=length-1;
        for (int j = (n-1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = value[j];
            char ck = value[k];
            value[j] = ck;
            value[k] = cj;
        }
        return Arrays.toString(value);
    }

    public static String rev2(String str){
        int length = str.length();
        char[] value = str.toCharArray();
        int n=length-1;
        int a=n/2-1;
        for (int j =a ; j >= 0; j--) {
            int k = a - j;
            char cj = value[j];
            char ck = value[k];
            value[j] = ck;
            value[k] = cj;
        }
        return Arrays.toString(value);
    }

    static  class Parent{

    }
    static  class SonOne extends Parent{

    }
    static class SonTwo extends Parent{

    }
    abstract  class WhyNa{
        String implString() {
            return null;
        }
        abstract String impl2();
    }

}
