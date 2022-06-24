package com.example.kafkaapp1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EntityAController {

    private final EntityAKafkaProducer producer;

    @PostMapping(value="/name")
    public String sendNameMessage(@RequestParam("message") String message) {
        producer.sendNameMessage(message);

        return "OK";
    }

    @PostMapping(value="/content")
    public String sendContentMessage(@RequestParam("message") String message) {
        producer.sendContentMessage(message);

        return "OK";
    }
}
