package com.example.kafkaapp2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EntityBController {

    private final EntityBKafkaProducer producer;

    @PostMapping(value = "/comment")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);

        return "OK";
    }
}
