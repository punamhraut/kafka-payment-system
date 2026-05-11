package com.example.kafkabankingdemo.service;

import com.example.kafkabankingdemo.model.PaymentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AuditConsumer {

    @KafkaListener(topics = "payment-success", groupId = "audit-group")
    public void consume(PaymentEvent event) {
        System.out.println("Audit Service received event : " + event);
    }
}
