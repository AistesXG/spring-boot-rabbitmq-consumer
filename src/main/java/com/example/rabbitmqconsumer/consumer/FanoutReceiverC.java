package com.example.rabbitmqconsumer.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {

    @RabbitHandler
    public  void process(Map testMessage) {
        System.out.println("FanoutReceiverC消费者收到的消息为：" + testMessage.toString());
    }
}