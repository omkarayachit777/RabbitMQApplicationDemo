package com.rabbitmq.producer.service;

import com.rabbitmq.producer.configuration.RabbitMQConfig;
import com.rabbitmq.producer.model.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerService {

    private final RabbitTemplate rabbitTemplate;

    public MessageProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Message message) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.ROUTING_KEY,
                "Sender --> " + message.getSender() + " : Message content -->" + message.getContent()
        );
    }
}
