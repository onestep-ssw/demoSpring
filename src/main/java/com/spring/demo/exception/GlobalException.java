package com.spring.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

@ControllerAdvice
@RestController
public class GlobalException {

   // @ExceptionHandler(value = Exception.class)
    public String exceptionP(){
        return "异常了";
    }
}
