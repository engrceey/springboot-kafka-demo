package com.kafkademo.demokafka.controller;


import com.kafkademo.demokafka.dto.PaymentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("kafka-demo")
@RequiredArgsConstructor
public class KafkaDemoController {


    private final KafkaTemplate<String, Object> template;

    @PostMapping(path = "/send")
    public void payBill(@RequestBody final PaymentDto paymentDto) {
        log.info("inside kafka-demo controller, publishing payBill");
        template.send("kafka-demo",
                paymentDto
        );
    }

}
