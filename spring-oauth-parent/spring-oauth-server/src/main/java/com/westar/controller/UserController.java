package com.westar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 这里提供了一个受保护的接口，用于获取用户信息，客户端访问这个接口的时候要求登录认证。
 */
@RestController
public class UserController {

    /**
     * 资源服务器提供的受保护接口
     * @param principal
     * @return
     */
    @RequestMapping("/user")
    public Principal user(Principal principal){
            return principal;
    }
}
