package com.example.kafkabankingdemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    //We create Kafka topics in Spring Boot
    // using a @Configuration class by defining a paymentTopic bean.

    @Bean
    public NewTopic paymentTopic() {
        return TopicBuilder.name("payment-success")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
