package com.spring.demo.retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

@Component
public class RetryDemo {


    private final int totalNum = 100000;

    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    /**
     *  @Retryable不是异步的，他是同步的，当接口调用时，如果启用此注解并且程序异常会很耗时的执行程序
     * @param num
     * @return
     */
    @Retryable(maxAttempts = 3,value = Exception.class,backoff = @Backoff(delay = 3000L,multiplier = 2))
    public Integer retryDemo1(Integer num){
        /*try {
            int i = 1 / 0;
        } catch (Exception e) {

        }*/
        System.out.println("num=="+sdf.format(new Date()));
       int aa= 100000/num;

        return totalNum - num;
    }

    /**
     * @Recover实在重复次数执行完之后去执行，但是生效的前提是，@Retryable返回的是void，@Recover也必须是void
     *
     * @param e
     */
    @Recover
    public void recover(Exception e) {
        e.printStackTrace();
        System.out.println("recover=");
        //记日志到数据库

    }
}
