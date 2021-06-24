package com.spring.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.spring.demo.test.ThreadLocalUser;
import com.spring.demo.test.UserInfo;
import com.spring.demo.util.DataUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("demo")
@Controller
public class DemoController {


    /**
     * 上传日志到服务器测试
     * @param logInfo
     */
    @RequestMapping("uploadLog")
    public void uploadLog(String logInfo){

        System.out.println("我上传的日志是==="+logInfo);
    }

    @ResponseBody
    @RequestMapping("login")
    public JSONObject loginTest(String account,String password){

        JSONObject jsonObject = new JSONObject();
        if ("admin".equals(account)&&"123".equals(password)){
            jsonObject.put("success","true");

            jsonObject.put("token", UUID.randomUUID().toString());
            return jsonObject;
        }
        jsonObject.put("SUCCESS","false");
        return jsonObject;
    }
    @RequestMapping("uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file){
        System.out.println("到我手里了");
        if (file.isEmpty()){
            System.out.println("空的文件");
            return "";
        }
        String targetFilePath = "D:\\test";
        File d = new File(targetFilePath);
        if (!d.exists()){
            d.mkdirs();
        }
        try {
            String path = file.getOriginalFilename();
            String pathNew = path.replaceAll(":", "_");
            System.out.println("originalFilename="+path);
            String substring = path.substring(path.lastIndexOf("."));
            File newFile = new File(targetFilePath + File.separator +pathNew);
            System.out.println("getPath="+newFile.getPath());
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("getVersion")
    @ResponseBody
    public String getVersion(){

        return "1.0.1";
    }
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
    @RequestMapping("mpaaspro")
    public ModelAndView mpaasPro(ModelAndView modelAndView){
        modelAndView.setViewName("mpaaspro");
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
       // jsonObject.put("dataT",dataUtil);
        return jsonObject;
    }

      @ResponseBody
      @RequestMapping("ewq")
      public JSONObject ewq(){
          JSONObject jsonObject = new JSONObject();
          jsonObject.put("count",20);
          DataUtil dataUtil = new DataUtil(18, "小红", 95, "一年级二班",
                  "http://30.40.27.217:8080/image/one_a.jpg",
                  "https://www.jianshu.com/p/9aa969dd1b4d");
          jsonObject.put("data",dataUtil);
        return jsonObject;
    }

    public List<DataUtil> getDataUtil(){
        List<DataUtil> arrayList = new ArrayList();
        arrayList.add(
                new DataUtil(18,"小红",95,"一年级二班",
                        "http://30.40.27.217:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(18,"小其",99,"二年级二班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(18,"小怕",56,"三年级二班",
                        "http://30.40.27.217:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(18,"小安",97,"一年级2班",
                        "http://30.40.27.217:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(18,"小模",35,"一年级1班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        arrayList.add(
                new DataUtil(23,"小张",67,"一年级四班",
                        "http://30.40.27.217:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(34,"米其林",12,"三年级六班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(56,"肯德基",45,"五年级二班",
                        "http://30.40.27.217:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(12,"麦当劳",23,"八年级一班",
                        "http://30.40.27.217:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(89,"好多肉",78,"一年级五班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        return arrayList;
    }


    public List<DataUtil> getDataUtil2(){
        List<DataUtil> arrayList = new ArrayList();
        arrayList.add(
                new DataUtil(23,"小张",67,"一年级四班",
                        "http://30.40.27.217:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(34,"米其林",12,"三年级六班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(56,"肯德基",45,"五年级二班",
                        "http://30.40.27.217:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(12,"麦当劳",23,"八年级一班",
                        "http://30.40.27.217:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(89,"好多肉",78,"一年级五班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        arrayList.add(
                new DataUtil(18,"小红",95,"一年级二班",
                        "http://30.40.27.217:8080/image/one_a.jpg",
                        "https://www.jianshu.com/p/9aa969dd1b4d"));
        arrayList.add(
                new DataUtil(18,"小其",99,"二年级二班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://blog.csdn.net/liqingwei168/article/details/86580656"));
        arrayList.add(
                new DataUtil(18,"小怕",56,"三年级二班",
                        "http://30.40.27.217:8080/image/one_c.jpg",
                        "https://blog.csdn.net/a990914093/article/details/81217581"));
        arrayList.add(
                new DataUtil(18,"小安",97,"一年级2班",
                        "http://30.40.27.217:8080/image/one_d.jpg",
                        "https://www.baidu.com/"));
        arrayList.add(
                new DataUtil(18,"小模",35,"一年级1班",
                        "http://30.40.27.217:8080/image/one_b.jpg",
                        "https://www.guancha.cn/internation/2020_09_28_566638.shtml"));
        return arrayList;
    }



}
