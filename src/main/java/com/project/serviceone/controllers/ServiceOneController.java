package com.project.serviceone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class ServiceOneController {
    @GetMapping("/message")
    public String test() {
        return "Hello from First Service";
    }
}
