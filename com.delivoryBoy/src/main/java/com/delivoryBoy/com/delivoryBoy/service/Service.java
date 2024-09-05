package com.delivoryBoy.com.delivoryBoy.service;

import com.delivoryBoy.com.delivoryBoy.Application;
import com.delivoryBoy.com.delivoryBoy.config.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@org.springframework.stereotype.Service

public class Service {
    private  KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    public Service(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.Location_Topic_Name,location);
        return true;
    }
}
