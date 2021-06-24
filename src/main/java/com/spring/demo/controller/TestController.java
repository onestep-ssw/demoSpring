package com.spring.demo.controller;

import com.spring.demo.jdbc.TaskAsync;
import com.spring.demo.mapper.TestMapper;
import com.spring.demo.retry.RetryDemo;
import com.spring.demo.server.ServerInterface;
import com.spring.demo.task.TeaskTest;
import com.spring.demo.test.ThreadLocalUser;
import com.spring.demo.test.UserInfo;
import com.spring.demo.util.AEnum;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

@RestController
@RequestMapping("test")
public class TestController {


    @Autowired
    private RetryDemo retryDemo;

    @Autowired
    private TeaskTest teaskTest;

    @Autowired
    private ServerInterface serverInterface;

  /*  @Autowired
    private TestMapper testMapper;*/
    @RequestMapping("addT")
    public String addT(Integer id,String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName(name);
        ThreadLocalUser.addUser(userInfo);
        return "";
    }

    @RequestMapping("getT")
    public String getT(){
        UserInfo user = ThreadLocalUser.getUser();
        System.out.println("user=="+user);
        return "";
    }


    @RequestMapping("retryTest")
    public String retryTest(Integer num){
        retryDemo.retryDemo1(num);
        return "测试retry=";
    }

    @RequestMapping("taskT")
    public String taskT(){
        teaskTest.task1();
        teaskTest.task2();
        teaskTest.task3();
        teaskTest.task4();
        return "hello";
    }


    @RequestMapping("addTest")
    public String addTest(){
        String s = TaskAsync.pieceInsertSql();
        //testMapper.insertTable(s);
        return "qweqw";
    }

    @PostMapping("qwea")
    public String qwea(@RequestBody AEnum aEnum){
        System.out.println(aEnum);
        return "qwewq";
    }
    @PostMapping("getS")
    public String getS(@RequestBody mlp p){
        String string = serverInterface.getString();
        System.out.println(string);
        return "str";
    }
    @Data
    class mlp{
      private   String str;
        private String str2;
    }
}
