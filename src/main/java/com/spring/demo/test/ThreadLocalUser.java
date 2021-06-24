package com.spring.demo.test;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

public class ThreadLocalUser {

    private static ThreadLocal<UserInfo> threadLocal=new ThreadLocal<>();

    public static void addUser(UserInfo userInfo){

        threadLocal.set(userInfo);
    }

    public static UserInfo getUser(){
        return threadLocal.get();
    }
}
