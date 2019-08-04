package com.westar.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "myqueues")
    public  void receiveMessage(String text){
        System.out.println(text);
    }

}

