package com.example.kafkaapp1;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EntityAKafkaConsumer {

    @KafkaListener(topics = "entityB", groupId = "entityB")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message: " + message);
    }
}
