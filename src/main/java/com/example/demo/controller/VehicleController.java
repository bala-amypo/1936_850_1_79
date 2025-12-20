package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @PostMapping("/{userId}")
    public String addVehicle(@PathVariable Long userId) {
        return "Vehicle Added";
    }

    @GetMapping("/user/{userId}")
    public String getVehicles(@PathVariable Long userId) {
        return "Vehicles by User";
    }
}
