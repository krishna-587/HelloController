package com.example.Spring.App;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Use Case 1: Basic GET Request
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
