package com.westar.controller;

import com.westar.activemq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.Destination;

@Controller
public class IndexController {
    @Autowired
    private Producer producer;

    @ResponseBody
    @RequestMapping("/sendMsg")
    public String sendMsg(){
        Destination destination = new ActiveMQQueue("myqueues");
        for (int i = 0; i < 3 ; i++) {
            //点对点
            producer.sendMessage(destination,"hello"+i);
        }
       return "success";

    }
}
