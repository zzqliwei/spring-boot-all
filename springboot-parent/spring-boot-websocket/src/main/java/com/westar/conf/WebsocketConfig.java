package com.westar.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketHandlerRegistration;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebsocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    //注册一个STOMP协议的节点，并映射到指定的url
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //注册一个STOMPde endpoint，并指定使用SocketJS协议
        registry.addEndpoint("/endpointSocket").withSockJS();
    }
    //配置消息代理

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //配置一个广播式消息代理
        registry.enableSimpleBroker("/topic");
    }
}
