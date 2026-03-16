package com.example.spring_greeting_app.controller;

import com.example.spring_greeting_app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    GreetingService service;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(required=false) String firstName,
            @RequestParam(required=false) String lastName){

        return service.getGreeting(firstName,lastName);
    }

}