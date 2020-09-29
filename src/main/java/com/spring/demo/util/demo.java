package com.spring.demo.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = formDate(998934);
        System.out.println(s);
        //System.out.println(new String("啊".getBytes("utf-8"),"utf-8"));

    }
    public static String formDate(int aa){
        int qw=aa/1000;
        StringBuffer sb=new StringBuffer("");
        if(aa<60000){
            //int q= aa/1000;//得到秒数
            if(qw<10){
                sb.append("00:0").append(qw);
            }else {
                sb.append("00:").append(qw);
            }
        }else if (aa>60000){
            int qa= qw/60;
            int qwe= qw%60;
            if (qa<10){
                sb.append("0").append(qa).append(":");
            }else{
                sb.append(qa).append(":");
            }

            if (qwe<10){
                sb.append("0").append(qwe);
            }else{
                sb.append(qwe);
            }
        }
       //String time="00:00";
       return sb.toString();
    }
}
