package com.example.spring_greeting_app.service;

import com.example.spring_greeting_app.model.Greeting;
import com.example.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repository;

    public Greeting saveGreeting(String message) {

        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return repository.save(greeting);
    }

}