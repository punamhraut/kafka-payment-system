package com.example.carapi.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {  //We create Kafka topics in Spring Boot using a @Configuration class by defining a NewTopic bean.

    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name("test-topic")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
