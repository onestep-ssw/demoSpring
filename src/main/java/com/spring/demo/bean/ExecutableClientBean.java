package com.spring.demo.bean;

import com.alibaba.xxpt.gateway.shared.client.http.ExecutableClient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ssw
 * @description  YIDA  将 ExecutableClient配置成bean
 * @date 2021/3/25
 */

@Configuration
public class ExecutableClientBean {

    //@Value("${xxpt.gateway.protocal}")
    private static final String protocal="https";
   // @Value("${xxpt.gateway.domainName}")
    private static final String domainName="s-api.alibaba-inc.com";
   // @Value("${xxpt.gateway.accessKey}")
    private static final String accessKey="qingdaohante-7Tu492OJsEQfaQnYv";
   // @Value("${xxpt.gateway.secretKey}")
    private static final String secretKey="xOuqxc789vj2JBXyATL40f046xyi7o0G1eaENTxS2";

    @Bean
    public ExecutableClient executableClient(){

        ExecutableClient executableClient = new ExecutableClient();
        executableClient.setProtocal(protocal);
        executableClient.setDomainName(domainName);
        executableClient.setAccessKey(accessKey);
        executableClient.setSecretKey(secretKey);
        executableClient.init();
        return executableClient;
    }
}
