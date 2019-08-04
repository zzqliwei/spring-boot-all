package com.westar.controller;

import com.westar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(){
        User user = new User();
        user.setId(123);
        user.setName("李四");
        user.setPasswd("666");
        user.setEmail("120@qq.com");
        user.setBirthDay(new Date());
        mongoTemplate.save(user);
        return "success";
    }

    @RequestMapping("/findUsers")
    @ResponseBody
    public List<User> findUsers(){
       return  mongoTemplate.findAll(User.class);
    }
}
