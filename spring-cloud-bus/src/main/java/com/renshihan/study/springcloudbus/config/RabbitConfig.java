package com.renshihan.study.springcloudbus.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 该rabbitmq配置项
 * 用来配置队列，交换器，路由等高级信息。
 * */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }

}
