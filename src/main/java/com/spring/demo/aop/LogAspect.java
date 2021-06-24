package com.spring.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.RequestHandledEvent;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;

/**
 * @author ssw
 * @description
 * @date 2021/6/17
 */

/*@Slf4j
@Aspect
@Component*/
public class LogAspect {



    /*@Pointcut("execution(public * com.spring.demo.controller..*.*(..))")
    public void aspectPoint(){

    }


    @Before("aspectPoint()")
    public void  methodRequest(JoinPoint joinPoint){

        ServletRequestAttributes servlet=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        assert servlet != null;
        HttpServletRequest request = servlet.getRequest();

        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        String remoteAddr = request.getRemoteAddr();
        log.info("URL:{}",requestURI);
        log.info("method:{}",method);
        log.info("ip:{}",remoteAddr);
        StringBuffer val=new StringBuffer("{");
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            val.append(name).append(":").append(request.getParameter(name)).append(",");
        }
        try {
            Collection<Part> parts = request.getParts();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        val.append("}");
        log.info("val:{}",val);
        Object[] args = joinPoint.getArgs();
        log.info("args:{}",Arrays.asList(args));
    }

    @After("aspectPoint()")
    public void methodResponse(JoinPoint joinPoint){
        ServletRequestAttributes servlet=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        assert servlet != null;
        HttpServletResponse response = servlet.getResponse();
        int status = response.getStatus();
        log.info("status :{}",status);
    }*/

}
