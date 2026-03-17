package com.example.spring_greeting_app.controller;

import com.example.spring_greeting_app.model.Greeting;
import com.example.spring_greeting_app.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    @PostMapping
    public Greeting saveGreeting(@RequestBody Greeting greeting) {

        return service.saveGreeting(greeting.getMessage());
    }
}