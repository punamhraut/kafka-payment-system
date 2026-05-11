package com.example.kafkabankingdemo.service;

import com.example.kafkabankingdemo.model.PaymentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentProducerService {

    @Autowired
    private KafkaTemplate<String, PaymentEvent> kafkaTemplate;

    public void publishPayment(PaymentEvent event) {
        kafkaTemplate.send("payment-success", event);
        System.out.println("Published Payment Event : " + event.getTransactionId());
    }
}
