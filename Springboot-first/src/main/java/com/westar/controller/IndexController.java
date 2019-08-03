package com.westar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//exclude = {RedisAutoConfiguration.class} 需要排出的
//@EnableAutoConfiguration() 启用自动配置
@Controller
public class IndexController {

    @Value("${IMAGE_SERVER}")
    private String IMAGE_SERVER;

    @ResponseBody
    @RequestMapping("/")
    public String first(){
        System.out.println(IMAGE_SERVER);
        return "hello word";
    }

}
