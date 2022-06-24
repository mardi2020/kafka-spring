package com.example.kafkaapp2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EntityBKafkaConsumer {

    @KafkaListener(topics = "entityA", groupId = "entityA")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message: " + message);
    }
}
