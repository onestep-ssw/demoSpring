package com.spring.demo.single;

import com.spring.demo.util.DataUtil;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author ssw
 * @description
 * @date 2021/5/19
 */

public class DemoSingle {


    private static  volatile   DemoSingle demoSingle;
    private static Set<DemoSingle> set=new HashSet();
    private DemoSingle(){
    }

    //此单例在多线程下面会创建多个  在方法上加syn属于重量级会造成阻塞
   /* public static DemoSingle getDemoSingle(){
        if (demoSingle==null){
            demoSingle=new DemoSingle();
        }
        set.add(demoSingle);
        return demoSingle;
    }*/
    /*public  static DemoSingle getDemoSingle(){

        //这个和放到上面没有区别
        synchronized (DemoSingle.class){
            if (demoSingle==null){
                demoSingle=new DemoSingle();
            }
        }
        set.add(demoSingle);
        return demoSingle;
    }*/

    //这种情况已经进入if
    /*public  static DemoSingle getDemoSingle(){
        if (demoSingle==null){
            synchronized (DemoSingle.class){
                demoSingle=new DemoSingle();
            }
        }
        set.add(demoSingle);
        return demoSingle;
    }*/

    //当第二个形成总到第一个if里面时保持可见性就不会往下走
    public  static DemoSingle getDemoSingle(){
        if (demoSingle==null){
            synchronized (DemoSingle.class){
                if (demoSingle==null){
                    demoSingle=new DemoSingle();

                }
            }
        }
        set.add(demoSingle);
        return demoSingle;
    }
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                    DemoSingle.getDemoSingle();
                    System.out.println(DemoSingle.set.size());
            }).start();
        }
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                DemoSingle.getDemoSingle();
                System.out.println(DemoSingle.set.size());
            }).start();
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Iterator<DemoSingle> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*HashSet<DataUtil> sets = new HashSet<>();
        sets.add(new DataUtil());
        sets.add(new DataUtil());
        System.out.println(sets.size());*/
    }
}
