package com.example.kafkabankingdemo.service;

import com.example.kafkabankingdemo.model.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsConsumer {

    @KafkaListener(topics = "payment-success", groupId = "analytics-group")
    public void consume(PaymentEvent event) {
        System.out.println("Analytics Service received event : " + event);
    }
}
