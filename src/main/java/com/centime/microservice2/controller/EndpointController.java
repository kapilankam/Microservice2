package com.centime.microservice2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hellomessage")
    public ResponseEntity getHelloMessage() {
        LOG.info("inside microservice2..");
        return ResponseEntity.ok("Hello");
    }
}
