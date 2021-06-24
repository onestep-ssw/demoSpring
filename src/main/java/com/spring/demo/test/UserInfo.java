package com.spring.demo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ssw
 * @description
 * @date 2021/5/17
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String name;
    private Integer id;
}
