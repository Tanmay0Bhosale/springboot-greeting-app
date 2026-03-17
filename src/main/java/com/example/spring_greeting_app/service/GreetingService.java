package com.example.spring_greeting_app.service;

import com.example.spring_greeting_app.model.Greeting;
import com.example.spring_greeting_app.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repository;

    public Greeting saveGreeting(String message) {

        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return repository.save(greeting);
    }
    public Greeting findGreetingById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }

    public Greeting updateGreeting(Long id,String message){

        Greeting greeting = repository.findById(id).orElse(null);

        if(greeting != null){
            greeting.setMessage(message);
            return repository.save(greeting);
        }

        return null;
    }
    public void deleteGreeting(Long id){
        repository.deleteById(id);
    }

}