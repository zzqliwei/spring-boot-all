package com.westar.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;


@Component
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    //发送消息
    public void sendMessage(Destination destination, String content ){
        jmsMessagingTemplate.convertAndSend(destination,content);

    }
}
