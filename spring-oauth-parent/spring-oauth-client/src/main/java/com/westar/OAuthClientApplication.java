package com.westar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

/**
 * 主要添加 Spring Security 依赖，另外因为 Spring Boot 2.0 之后代码的合并，
 * 需要添加 spring-security-oauth2-autoconfigure ，才能使用 @EnableOAuth2Sso 注解。
 */
@SpringBootApplication
public class OAuthClientApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(OAuthClientApplication.class,args);
    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
