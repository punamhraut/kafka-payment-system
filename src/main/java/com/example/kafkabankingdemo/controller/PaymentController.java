package com.example.kafkabankingdemo.controller;

import com.example.kafkabankingdemo.model.PaymentEvent;
import com.example.kafkabankingdemo.service.PaymentProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentProducerService producerService;

    @PostMapping("/process")
    public String processPayment(@RequestBody PaymentEvent paymentEvent) {

        producerService.publishPayment(paymentEvent);

        return "Payment processed and event published to Kafka";
    }
}
