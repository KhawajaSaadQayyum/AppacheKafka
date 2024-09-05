package com.delivoryBoy.com.delivoryBoy.controller;

import com.delivoryBoy.com.delivoryBoy.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/location")
public class Controller {
    private final Service service;
    @Autowired
    public Controller(Service service) {
        this.service = service;
    }
private Logger logger = LoggerFactory.getLogger(Controller.class);
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        service.updateLocation("( "+ Math.round(Math.random()*100) +" ," + Math.round(Math.random()*100) +" )" );
        return new ResponseEntity<>(Map.of("Message", "Location Updated"), HttpStatus.OK);
    }
}
