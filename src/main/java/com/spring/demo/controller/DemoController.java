package com.spring.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.spring.demo.util.DataUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("demo")
@Controller
public class DemoController {


    @RequestMapping("h5")
    public ModelAndView forwordH5(ModelAndView modelAndView){
        modelAndView.setViewName("androidh5");
        return modelAndView;
    };
    @RequestMapping("demo")
    @ResponseBody
    public String demo(){
        return "aaa";
    }

    @RequestMapping("re")
    public ModelAndView reverseH(ModelAndView modelAndView){
        modelAndView.setViewName("reverseh5");
        return modelAndView;
    };
    @RequestMapping("demo1")
    public ModelAndView demo1(ModelAndView modelAndView){
        modelAndView.setViewName("demo1");
        return modelAndView;
    };

    @RequestMapping("videoa")
    public ModelAndView forwordVideo(ModelAndView modelAndView){
        modelAndView.setViewName("videoa");
        return modelAndView;
    };

    @RequestMapping("mpaas")
    public ModelAndView mpaas(ModelAndView modelAndView){
        modelAndView.setViewName("mpaas");
        return modelAndView;
    };
    @RequestMapping("jsonS")
    @ResponseBody
    public JSONObject jsonS(int size){
        List<DataUtil> dataUtil;
        if(size==1){
            dataUtil= getDataUtil();
        }else if (size==2){
            dataUtil= getDataUtil2();
        }else{
            dataUtil=new ArrayList<>();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count",20);
        jsonObject.put("data",dataUtil);
        return jsonObject;
    }

    public List<DataUtil> getDataUtil(){
        List<DataUtil> arrayList = new ArrayList();
        arrayList.add(
                new DataUtil(18,"小红",95,"一年级二班",
                        "http://30.40.27.246:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(18,"小其",99,"二年级二班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(18,"小怕",56,"三年级二班",
                        "http://30.40.27.246:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(18,"小安",97,"一年级2班",
                        "http://30.40.27.246:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(18,"小模",35,"一年级1班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        arrayList.add(
                new DataUtil(23,"小张",67,"一年级四班",
                        "http://30.40.27.246:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(34,"米其林",12,"三年级六班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(56,"肯德基",45,"五年级二班",
                        "http://30.40.27.246:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(12,"麦当劳",23,"八年级一班",
                        "http://30.40.27.246:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(89,"好多肉",78,"一年级五班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        return arrayList;
    }


    public List<DataUtil> getDataUtil2(){
        List<DataUtil> arrayList = new ArrayList();
        arrayList.add(
                new DataUtil(23,"小张",67,"一年级四班",
                        "http://30.40.27.246:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(34,"米其林",12,"三年级六班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(56,"肯德基",45,"五年级二班",
                        "http://30.40.27.246:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(12,"麦当劳",23,"八年级一班",
                        "http://30.40.27.246:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(89,"好多肉",78,"一年级五班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        arrayList.add(
                new DataUtil(18,"小红",95,"一年级二班",
                        "http://30.40.27.246:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(18,"小其",99,"二年级二班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(18,"小怕",56,"三年级二班",
                        "http://30.40.27.246:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(18,"小安",97,"一年级2班",
                        "http://30.40.27.246:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(18,"小模",35,"一年级1班",
                        "http://30.40.27.246:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        return arrayList;
    }
}
