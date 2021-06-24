package com.spring.demo.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.xxpt.gateway.shared.client.http.ExecutableClient;
import com.alibaba.xxpt.gateway.shared.client.http.PostClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * aecp网关服务请求工具
 * @author ssw
 * @description
 * @date 2021/3/25
 */

@Component
public class AecpGatewayRequestUtil {

     @Autowired
     private ExecutableClient executableClient;

    /**
     * 请求宜搭
     * @param param
     * @param url
     * @return
     */
    public AecpGatewayResult baseRequest(Map<String, String> param, String url) {
        try {

            PostClient postClient =  executableClient.newPostClient(url);
            if (!CollectionUtils.isEmpty(param)) {
                for (Map.Entry<String, String> entry : param.entrySet()) {
                    postClient.addParameter(entry.getKey(), entry.getValue());
                }
            }
            String result = postClient.post();
            System.out.println("result="+result);
            return JSON.parseObject(result, AecpGatewayResult.class);
        }catch(Exception e){
            AecpGatewayResult result= new AecpGatewayResult();
            result.setSuccess(false);
            result.setResult("false");
            return result;
        }

    }


}
