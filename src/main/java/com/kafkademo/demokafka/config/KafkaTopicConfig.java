package com.kafkademo.demokafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaDemoTopic() {
        return TopicBuilder.name("kafka-demo")
                .replicas(1)
                .partitions(3)
                .build();
    }
}
