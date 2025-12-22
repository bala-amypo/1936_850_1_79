package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @PostMapping
    public String createLocation() {
        return "Location Created";
    }

    @GetMapping
    public String getAll() {
        return "All Locations";
    }
}
