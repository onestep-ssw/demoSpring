package com.spring.demo.util;

import com.spring.demo.config.DemoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ssw
 * @description
 * @date 2021/6/8
 */

@Data
@AllArgsConstructor
public class AEnum {

    private String name;

    private DemoEnum demoEnum;
}
