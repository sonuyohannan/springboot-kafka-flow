package com.kafka.springbootkafka.controller;

import com.kafka.springbootkafka.kafka.JsonKafkaProducer;
import com.kafka.springbootkafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    //nedd constructor injection

    public JsonMessageController(JsonKafkaProducer kafkaProducer){

        this.kafkaProducer=kafkaProducer;
    }

 @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
     kafkaProducer.sendMessage(user);
     return ResponseEntity.ok("Json message sent to kafka topic");
 }

}
