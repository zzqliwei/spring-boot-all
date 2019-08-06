package com.westar.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Scheduled(cron = " 00/1 * * * * ?")
    public void send(){
        String msg = UUID.randomUUID().toString();
        ListenableFuture<SendResult<String, String>> listenableFuture = kafkaTemplate.send("test",msg);
        listenableFuture.addCallback(o ->{
            System.out.println("send-消息发送成功" + msg);
        },throwable -> {
            System.out.println("send-消息发送失败" + msg);
        });

    }
}
