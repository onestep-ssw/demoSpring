package com.spring.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.spring.demo.bean.AecpGatewayRequestUtil;
import com.spring.demo.bean.AecpGatewayResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ssw
 * @description
 * @date 2021/6/23
 */

@RestController
@RequestMapping("yida")
public class YiDaController {


    public static final String UPDATE_FORM_DATAS = "/yida_vpc/form/updateFormData.json";
    public static final String   search="/yida_vpc/form/searchFormDatas.json";
    public static final String   searchID="/yida_vpc/form/searchFormDataIds.json";
    public static final String   updateForm="/yida_vpc/form/updateFormData.json";

    @Autowired
    private AecpGatewayRequestUtil aecpGatewayRequestUtil;
    @RequestMapping("yiDaApi")
    public String yiDaApi(@RequestParam String appType,
                          @RequestParam String systemToken,
                          @RequestParam String userId,
                          @RequestParam String formInstId,
                          @RequestParam String updateFormDataJson){



        return "success";
    }
    @RequestMapping("demo")
    public String demo(){


        HashMap<String, String> map = new HashMap<>();
        map.put("appType","APP_FCP9M5D2ZHAJWAEFHUJJ");
        map.put("systemToken","7D966WA1AGVO0F6GXFQ5P2Q37SW72E2TV7YMKH2");
        map.put("userId","15952363238819260");
        map.put("formUuid","FORM-9H666R71SY8R16TXYVMMPTJ7SHXN1WZOLW8QKI1");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("textField_kq8wlw56","1381234567712");
        map.put("searchFieldJson",jsonObject.toJSONString());
        AecpGatewayResult aecpGatewayResult =
                aecpGatewayRequestUtil.baseRequest(map,searchID);
        if (aecpGatewayResult.isSuccess()){

            JSONObject jsonObject1 = JSONObject.parseObject(aecpGatewayResult.getResult());
            String data = jsonObject1.get("data").toString();
            System.out.println("data="+data);
            JSONArray jsonArray = JSONArray.parseArray(data);
            List<String> strings = jsonArray.toJavaList(String.class);
            if (!strings.isEmpty()){
                System.out.println(strings.get(0));
            }

        }



        System.out.println(aecpGatewayResult.toString());
        return "success";
    }


    @RequestMapping("updateForm")
    public String updateForm(){

        HashMap<String, String> map = new HashMap<>();
        map.put("appType","APP_FCP9M5D2ZHAJWAEFHUJJ");
        map.put("systemToken","7D966WA1AGVO0F6GXFQ5P2Q37SW72E2TV7YMKH2");
        map.put("userId","15952363238819260");
        map.put("formUuid","FORM-9H666R71SY8R16TXYVMMPTJ7SHXN1WZOLW8QKI1");
        map.put("formInstId","FINST-TS766QC18Z8RE97L1VBWPDOYC82S207HC59QKH2");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("textField_kq95ac6f","5");
        map.put("updateFormDataJson",jsonObject.toJSONString());
        AecpGatewayResult aecpGatewayResult =
                aecpGatewayRequestUtil.baseRequest(map,updateForm);
        return "succ";

    }
}
