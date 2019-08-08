package com.westar.controller;

import com.westar.pojo.UserNode;
import com.westar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/saveUserNode")
    @ResponseBody
    public String saveUserNode(){
        UserNode userNode = new UserNode();
        userNode.setName("张三");
        userNode.setUserId("666");
        userNode.setAge(12);
        userNode.setNodeId(11L);
        userService.addUserNode(userNode);
        return "success";

    }

}
