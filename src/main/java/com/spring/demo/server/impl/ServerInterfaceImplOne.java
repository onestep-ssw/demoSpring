package com.spring.demo.server.impl;

import com.spring.demo.server.ServerInterface;
import org.springframework.stereotype.Service;

/**
 * @author ssw
 * @description
 * @date 2021/6/17
 */
@Service
public class ServerInterfaceImplOne implements ServerInterface {


    @Override
    public String getString() {
        return "ServerInterfaceImplOne";
    }
}
