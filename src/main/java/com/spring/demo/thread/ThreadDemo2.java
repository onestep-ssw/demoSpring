package com.spring.demo.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ssw
 * @description
 * @date 2021/5/18
 */

public class ThreadDemo2 {

    static  AtomicInteger a=new AtomicInteger(1);
    static  volatile Long b=1L;
    public static void main(String[] args) {
       /* b =1;
        int m = b;
        ++m;
        b=m;*/

        new Thread(()->{
            for (int i = 0; i <10000 ; i++) {

                 System.out.println(Thread.currentThread().getName()+"a="+a.incrementAndGet());
                //System.out.println(Thread.currentThread().getName()+"b="+(b));
            }

        }).start();

        new Thread(()->{
            for (int i = 0; i <10000 ; i++) {

                System.out.println(Thread.currentThread().getName()+"a="+a.incrementAndGet());
                //System.out.println(Thread.currentThread().getName()+"b="+(++b));
            }
        }).start();
    }


}
