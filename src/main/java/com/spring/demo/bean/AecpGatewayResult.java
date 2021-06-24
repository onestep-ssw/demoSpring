package com.spring.demo.bean;

import lombok.Data;

/**
 * @author ssw
 * @description
 * @date 2021/3/25
 */

@Data
public class AecpGatewayResult {

    private boolean success;

    private String content;

    private String result;

    private String errorCode;

    private String errorMsg;
}
