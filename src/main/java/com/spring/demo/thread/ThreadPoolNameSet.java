package com.spring.demo.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ssw
 * @description
 * @date 2021/5/18
 */

public class ThreadPoolNameSet implements ThreadFactory {

    private final AtomicInteger threadNum = new AtomicInteger();
    private final ThreadFactory threadFactory;
    private final String name;

    public ThreadPoolNameSet(ThreadFactory threadFactory, String name) {
        this.threadFactory = threadFactory;
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = threadFactory.newThread(r);
        thread.setName(name + " [#" + threadNum.incrementAndGet() + "]");
        return thread;
    }
}
