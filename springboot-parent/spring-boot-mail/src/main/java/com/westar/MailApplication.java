package com.westar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 若是出现认证失败了
 * 将下载后local_policy.jar和US_export_policy.jar 替换掉JDB1.8的jre\lib\security文件夹
 */
@SpringBootApplication
public class MailApplication {
    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class,args);
    }
}
