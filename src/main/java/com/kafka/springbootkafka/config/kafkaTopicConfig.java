package com.kafka.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic TestTopic(){
        return TopicBuilder.name("TestTopic").build();
    }

    @Bean
    public NewTopic NewJsonTopic(){
        return TopicBuilder.name("jsontopic").build();
    }
}
