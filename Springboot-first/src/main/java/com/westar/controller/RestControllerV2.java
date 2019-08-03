package com.westar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//exclude = {RedisAutoConfiguration.class} 需要排出的
//@EnableAutoConfiguration() 启用自动配置
@RestController
public class RestControllerV2 {

    @Value("${IMAGE_SERVER}")
    private String IMAGE_SERVER;

    @RequestMapping("/aa")
    public String first(){
        System.out.println(IMAGE_SERVER);
        return "hello word";
    }

    @RequestMapping("/show/{aa}")
    public String show(@PathVariable("aa") String aa){
        System.out.println(aa);
        return "hello word";
    }

}
