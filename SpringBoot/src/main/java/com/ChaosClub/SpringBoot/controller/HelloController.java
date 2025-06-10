package com.ChaosClub.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")// Maps HTTP GET REQUEST FROM THE CLIENT
    public String sayHello(){
        return "Hello, World from my first Controller";
    }
    @GetMapping("/user/name")// Maps HTTP GET REQUEST FROM THE CLIENT
    public String getUserName(){
        // here you call service method where we have bussiness logic
        // avoid putting bussiness logic in production code
        return "Name is Rakshak";
    }
}

// client-> controller -> service -> repository
//controller -> handles incoming http request
//service -> handles business logic
//repository -> handles database operation
