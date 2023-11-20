package com.kafka.springbootkafka.kafka;

import com.kafka.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonkafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "jsontopic",groupId = "myGroup")
    public void consume (User user){
        LOGGER.info(String.format("message recieved -> %s",user.toString()));
    }
}
