package com.spring.demo.thread;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author ssw
 * @description
 * @date 2021/5/19
 */

public class ThreadDemo5 {

    //volatile指的是主内存的改变会对线程的副本
    static volatile boolean a=true;

    static AtomicBoolean atomicBoolean=new AtomicBoolean(true);
    public static void main(String[] args) {
        new Thread(()->{

            while (atomicBoolean.get()){
                System.out.println("aa="+atomicBoolean.get());
            }
            System.out.println("结束了"+atomicBoolean.get());
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(3000);
                //a=false;
                System.out.println("改变了"+atomicBoolean.getAndSet(false));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }

    public final  void aa(){


        ForkJoinTask.invokeAll();
    }
}
