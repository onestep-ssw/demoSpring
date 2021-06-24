package com.spring.demo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author ssw
 * @description
 * @date 2021/5/18
 */


@EnableAsync
@Component
public class TeaskTest {


    @Async
    public void task1(){

        try {
            Thread.sleep(2000);
            System.out.println("task1="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Async
    public void task2(){

        try {
            Thread.sleep(2000);
            System.out.println("task2="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Async
    public void task3(){

        try {
            Thread.sleep(2000);
            System.out.println("task3="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Async
    public void task4(){

        try {
            Thread.sleep(2000);
            System.out.println("task4="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
