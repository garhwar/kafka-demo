package com.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaPublishController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping(value = "/publish")
    public void publishToTopic(@RequestBody Message message)
    {
        this.kafkaProducerService.sendMessage(message);
    }
}
