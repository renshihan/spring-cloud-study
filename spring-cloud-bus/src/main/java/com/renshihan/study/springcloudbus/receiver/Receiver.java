package com.renshihan.study.springcloudbus.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * 消息消费者
 * */
@Slf4j
@Component
//该注解定义该类对hello队列的监听
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void proccess(String hello){
        log.info("Receiver:"+hello);
    }
}
