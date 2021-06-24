package com.spring.demo.util;

import com.spring.demo.test.UserInfo;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ssw
 * @description
 * @date 2021/5/20
 */

public class Demo122312 {

    public static void main(String[] args) {

      /*  List<UserInfo> userInfos = new ArrayList<>();

        userInfos.add(new UserInfo("小明",1));
        userInfos.add(new UserInfo("小红",2));
        userInfos.add(new UserInfo("小蓝",3));
        userInfos.add(new UserInfo("小皇",4));
        userInfos.add(new UserInfo("小明",1));

        System.out.println(userInfos);
        List<UserInfo> userInfos2 = new ArrayList<>();
        Collections.copy(userInfos,userInfos2);
        System.out.println(userInfos2);
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("1");
        strings.add("1");
        String join = String.join(",", strings);
        System.out.println(join);*/

        /*String A="";
        String B=null;
        if (StringUtils.isAllBlank(A,B)){
            System.out.println("null");
        }*/

        String qwe="asd's\"a";
        StringBuffer stringBuffer = new StringBuffer("'");
        qwe.replaceAll("'","\'");
        qwe.replaceAll("\"","\"");
        stringBuffer.append(qwe);
        stringBuffer.append("'");
        System.out.println(qwe);
        System.out.println(stringBuffer.toString());
 /*       StringBuffer aaa=new StringBuffer("");
        aaa.append("\"").append("a").append("\"");
        System.out.println(aaa.toString());*/
        //餐饮服务
        //

       /* Map<Integer, List<UserInfo>> collect = userInfos.stream().collect(Collectors.groupingBy(UserInfo::getId));

        Set<Map.Entry<Integer, List<UserInfo>>> entries = collect.entrySet();
        Iterator<Map.Entry<Integer, List<UserInfo>>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, List<UserInfo>> next = iterator.next();
            System.out.print("key="+next.getKey());
            next.getValue().forEach(System.out::println);

        }*/

             /*   Objects.requireNonNull(null);

        UserInfo userInfo = new UserInfo();*/


       /* List l = getL();
        l.add("123");*/
       // Optional<String> lq = getLQ(1);
        //lq.isPresent()
        /*if (L != NULL && l.isEmpty()){
            System.out.println("aa");
        }*/
    }

    public static List getL(){

        //ArrayList<Object> objects = new ArrayList<>();
        List   a=null;
        if(true){
            
            return Collections.unmodifiableList(new ArrayList());
        }else{
            return Collections.EMPTY_LIST;
        }
    }

    public static String getL(Integer a){

        //ArrayList<Object> objects = new ArrayList<>();


        HashMap<Integer, String> map = new HashMap<>();


        return Optional.ofNullable(map.get(a)).orElseGet(()->"asss");

    }


    public static Optional<String> getLQ(Integer a){

        //ArrayList<Object> objects = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        return Optional.ofNullable(map.get(a));

    }
}
