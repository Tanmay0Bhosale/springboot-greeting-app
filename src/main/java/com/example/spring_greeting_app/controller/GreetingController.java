package com.example.spring_greeting_app.controller;

import com.example.spring_greeting_app.model.Greeting;
import com.example.spring_greeting_app.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    @PostMapping
    public Greeting saveGreeting(@RequestBody Greeting greeting) {

        return service.saveGreeting(greeting.getMessage());
    }

    @GetMapping("/{id}")
    public Greeting findGreeting(@PathVariable Long id) {
        return service.findGreetingById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return service.getAllGreetings();
    }

    @PutMapping("/{id}")
    public Greeting updateGreeting(
            @PathVariable Long id,
            @RequestBody Greeting greeting){

        return service.updateGreeting(id,greeting.getMessage());
    }

    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable Long id){

        service.deleteGreeting(id);

        return "Greeting deleted successfully";
    }
}