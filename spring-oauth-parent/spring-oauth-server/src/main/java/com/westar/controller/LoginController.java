package com.westar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 这里提供了一个自定义的登录接口，用于跳转到自定义的同一认证登录页面。
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
