package com.kafkademo.demokafka.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDto {
    private String itemId;
    private String itemName;
    private double amount;
}
