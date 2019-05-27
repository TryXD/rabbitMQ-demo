package com.xd.rabbitmq.server;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQServer {

    @RabbitListener(queues = "test")
    public void receive(String message) {
        System.out.println("收到的 message 是：" + message);
    }
}