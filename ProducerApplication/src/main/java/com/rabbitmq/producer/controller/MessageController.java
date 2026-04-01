package com.rabbitmq.producer.controller;

import com.rabbitmq.producer.model.Message;
import com.rabbitmq.producer.service.MessageProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producer")
public class MessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private final MessageProducerService messageProducerService;

    public MessageController(MessageProducerService messageProducerService) {
        this.messageProducerService = messageProducerService;
    }

    @PostMapping("/send")
    public String publishMessage(@RequestBody Message message) {
        messageProducerService.sendMessage(message);
        return "Message sent: " + message;
    }
}
