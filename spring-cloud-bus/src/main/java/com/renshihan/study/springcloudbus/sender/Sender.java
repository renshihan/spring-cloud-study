package com.renshihan.study.springcloudbus.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 创建消息生产者
 * */
@Slf4j
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
        String context="hello-----------------------"+new Date();
        log.info("Sender："+context);
        //我们产生一个字符串，并发送到名为hello的队列中
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
