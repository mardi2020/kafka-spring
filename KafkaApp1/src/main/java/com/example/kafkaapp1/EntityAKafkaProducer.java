package com.example.kafkaapp1;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntityAKafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendNameMessage(String message) {
        System.out.println("[메시지 발행]: " + message);
        kafkaTemplate.send("name", message);
    }

    public void sendContentMessage(String message) {
        System.out.println("[메시지 발행]: " + message);
        kafkaTemplate.send("content", message);
    }
}
