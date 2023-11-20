package com.kafka.springbootkafka.kafka;

import com.kafka.springbootkafka.payload.User;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
 // add a logger
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;


    //constructor injection



   public JsonKafkaProducer( KafkaTemplate kafkaTemplate){
      this.kafkaTemplate=kafkaTemplate;
   }

    public void sendMessage(User userdata){

       LOGGER.info(String.format("Message sent ->%s",userdata.toString()));
       Message<User> message= MessageBuilder.withPayload(userdata).setHeader(KafkaHeaders.TOPIC,"jsontopic").build();
kafkaTemplate.send(message);
   }

}

