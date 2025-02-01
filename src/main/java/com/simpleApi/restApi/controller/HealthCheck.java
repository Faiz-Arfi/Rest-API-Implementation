package com.simpleApi.restApi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheck {
    
    @GetMapping("/health")
    public String healthCheck() {
        return "App is running fine";
    }
}
