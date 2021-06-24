package com.spring.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ssw
 * @description
 * @date 2021/6/8
 */

@Configuration
public class WebConfigEnum implements WebMvcConfigurer {


    @Autowired
    EnumConvertFactory enumConvertFactory;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(enumConvertFactory);
    }
}
