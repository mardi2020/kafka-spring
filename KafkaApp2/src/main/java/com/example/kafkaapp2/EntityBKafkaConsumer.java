package com.example.kafkaapp2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EntityBKafkaConsumer {

    @KafkaListener(topics = "name", groupId = "entityA")
    public void consumeName(String message) throws IOException {
        System.out.println("[name] Consumed message: " + message);
    }

    @KafkaListener(topics = "content", groupId = "entityA")
    public void consumeContent(String message) throws IOException {
        System.out.println("[content] Consumed message = " + message);
    }
}
