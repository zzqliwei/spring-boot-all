package com.westar.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJob {
    @Scheduled(fixedDelay = 1000 )
    public void run(){
        System.out.println("定时任务执行了！");
    }
}
