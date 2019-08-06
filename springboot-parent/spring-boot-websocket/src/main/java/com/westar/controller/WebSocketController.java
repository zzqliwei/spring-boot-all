package com.westar.controller;

import com.westar.pojo.SocketMsg;
import com.westar.pojo.SocketResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebSocketController {

    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @MessageMapping(value = "/getServerTime")
    @SendTo(value = "/topic/getResponse")
    public SocketResponse serverTime(SocketMsg socketMsg) throws InterruptedException{
        return new SocketResponse(socketMsg.getMsg() + sf.format(new Date()));
    }
}
