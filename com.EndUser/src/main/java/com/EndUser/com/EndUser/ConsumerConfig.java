package com.EndUser.com.EndUser;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerConfig {

    @KafkaListener(topics = Constants.Updated_location, groupId = Constants.groupId)

    public void getLocation(String location){
        System.out.println(location);
    }
}
