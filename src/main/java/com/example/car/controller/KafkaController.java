package com.example.car.controller;

import com.example.car.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producer;

    @PostMapping("/send")
    public String send(@RequestParam String msg) {
        producer.sendMessage(msg);
        return "Message sent";
    }
}
