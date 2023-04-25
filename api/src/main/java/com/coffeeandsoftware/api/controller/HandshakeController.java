package com.coffeeandsoftware.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandshakeController {
    
    @GetMapping("/sayhello")
    public String sayHelloWorld() {
        return "Hello World!";
    }
}
