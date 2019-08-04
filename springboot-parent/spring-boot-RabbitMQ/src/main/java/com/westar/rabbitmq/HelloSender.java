package com.westar.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(){
        String content = "hello,你好！";
        this.rabbitTemplate.convertAndSend("hel",content);
        return "发送成功";

    }
}
