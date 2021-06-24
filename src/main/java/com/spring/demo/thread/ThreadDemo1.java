package com.spring.demo.thread;

import org.omg.CORBA.StringHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

@Component
public class ThreadDemo1 {

    private static final   int corePoolSize=3;
    private static final   int maximumPoolSize=3;
    private static final   long keepAliveTime=1L;
    private static final  TimeUnit unit=TimeUnit.SECONDS;
    private static final  BlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<>(100);//等待的队列
    private static final  RejectedExecutionHandler handler= new ThreadPoolExecutor.CallerRunsPolicy();


   /* @Bean
    public ThreadPoolExecutor getBean(){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                new ArrayBlockingQueue<>(6),
                new ThreadPoolExecutor.CallerRunsPolicy());
        return executor;
    }*/
    public static void main(String[] args) {
/*
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool();*/
       // Executors.newCachedThreadPool();



        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                new ArrayBlockingQueue<>(100),
                new ThreadPoolNameSet(Executors.defaultThreadFactory(),"PPP"),
                new ThreadPoolExecutor.DiscardOldestPolicy());


        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("CurrentThread name:" + Thread.currentThread().getName()
                        + "date：" + Instant.now().atZone(ZoneId.systemDefault()));
            });
        }
        //System.out.println("size=="+executor.getQueue().size());

        //future(executor);

        //终止线程池  关闭任务
        executor.shutdown();
        try {
            //清除执行器
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished all threads");
    }

    public static  void future(ThreadPoolExecutor executor){

        ArrayList<Future<String>> futures = new ArrayList<>();
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return Thread.currentThread().getName();
            }
        };
        for (int i = 0; i < 10; i++) {
            Future<String> submit = executor.submit(callable);
            try {
                System.out.println("thread="+submit.get()+"/date="+Instant.now().atZone(ZoneId.systemDefault()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            //futures.add(submit);
        }


        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        futures.stream().forEach(e->{

            try {
                String s = e.get();
                System.out.println("s==="+s);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            } catch (ExecutionException executionException) {
                executionException.printStackTrace();
            }
        });*/


    }
}
