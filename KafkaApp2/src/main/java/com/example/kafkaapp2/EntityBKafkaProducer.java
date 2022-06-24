package com.example.kafkaapp2;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntityBKafkaProducer {

    private static final String TOPIC = "entityB";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("[메시지 발행]: " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
