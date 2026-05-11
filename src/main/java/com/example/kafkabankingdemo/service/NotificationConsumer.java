package com.example.kafkabankingdemo.service;

import com.example.kafkabankingdemo.model.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "payment-success", groupId = "notification-group")
    public void consume(PaymentEvent event) {
        System.out.println("Notification Service received event : " + event);
    }
}
