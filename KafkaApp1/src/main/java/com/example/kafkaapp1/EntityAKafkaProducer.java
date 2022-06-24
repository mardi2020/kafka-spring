package com.example.kafkaapp1;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntityAKafkaProducer {

    private static final String TOPIC = "entityA";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("[메시지 발행]: " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
