package com.demo.spring_security.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/test")
    public String testEndpoint() {
        SecurityContextHolder.getContext().getAuthentication().getDetails();
        return "Demo";
    }
}
