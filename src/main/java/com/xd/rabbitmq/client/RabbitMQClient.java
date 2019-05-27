package com.xd.rabbitmq.client;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQClient {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        System.out.println("发送的 message 是：" + message);
        rabbitTemplate.convertAndSend("test", message);
    }

}
