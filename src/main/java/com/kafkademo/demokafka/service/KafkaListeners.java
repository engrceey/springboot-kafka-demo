package com.kafkademo.demokafka.service;

import com.kafkademo.demokafka.dto.PaymentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener( topics = "kafka-demo",groupId = "groupId",containerFactory = "factory")
    public void listener(PaymentDto paymentDto) {
        log.info("Data has been consumed :: Data :: {}", paymentDto);
    }
}
