package com.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "quickstart-events", groupId = "test-consumer")
    public void listenGroupTestConsumer(Message message) {
        System.out.println("Received message in group test-consumer: " + message);
    }

}
