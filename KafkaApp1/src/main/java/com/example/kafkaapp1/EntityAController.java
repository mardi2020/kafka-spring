package com.example.kafkaapp1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EntityAController {

    private final EntityAKafkaProducer producer;

    @PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);

        return "OK";
    }

}
