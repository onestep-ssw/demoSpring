package com.spring.demo.util;

import lombok.Data;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

@Data
public class ThreadLocalTest {

    private int a;

    private static ThreadLocal<ThreadLocalTest> threadLocal= ThreadLocal.withInitial(ThreadLocalTest::new);

    private static ThreadLocal<ThreadLocalTest> userInfo = new ThreadLocal<>();

    public static void main(String[] args) {

        threadLocal.set(new ThreadLocalTest());
        threadLocal.set(new ThreadLocalTest());
        ThreadLocalTest threadLocalTest = threadLocal.get();
        System.out.println(threadLocalTest);
    }




    @Override
    public String toString() {
        return "ThreadLocalTest{" +
                "a=" + a +
                '}';
    }
}
