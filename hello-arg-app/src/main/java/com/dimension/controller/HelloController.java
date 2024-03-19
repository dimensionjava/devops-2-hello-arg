package com.dimension.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

// http://localhost:8001/hola
@GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
