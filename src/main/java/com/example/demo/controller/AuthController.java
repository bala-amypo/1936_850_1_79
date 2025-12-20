package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public String register() {
        return "Register API";
    }

    @PostMapping("/login")
    public String login() {
        return "Login API";
    }
}
