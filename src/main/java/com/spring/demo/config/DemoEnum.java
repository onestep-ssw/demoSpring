package com.spring.demo.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ssw
 * @description
 * @date 2021/6/8
 */

@Getter
@AllArgsConstructor
public enum DemoEnum  implements BaseEnum<Integer>{

    HUANG(3, "黄钻"),
    HONG(4, "红钻"),
    ;
    private Integer code;
    private String value;
    @Override
    public Integer getCode() {
        return this.code;
    }
}
