package com.delivoryBoy.com.delivoryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    public NewTopic topic(){
        return TopicBuilder
                .name(AppConstant.Location_Topic_Name)
                .build();

    }
}
