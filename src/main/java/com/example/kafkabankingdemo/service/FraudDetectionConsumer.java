package com.example.kafkabankingdemo.service;

import com.example.kafkabankingdemo.model.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionConsumer {

    @KafkaListener(topics = "payment-success", groupId = "fraud-group")
    public void consume(PaymentEvent event) {
        System.out.println("Fraud Detection Service received event : " + event);
    }
}
