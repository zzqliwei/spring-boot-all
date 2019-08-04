package com.westar.controller;

import com.westar.pojo.User;
import com.westar.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {
    @Autowired
    private Userservice userservice;

    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(){
        User user = new User();
        user.setName("李四");
        user.setPasswd("666");
        user.setEmail("120@qq.com");
        user.setBirthDay(new Date());
        userservice.addUser(user);
        return "success";
    }
}
