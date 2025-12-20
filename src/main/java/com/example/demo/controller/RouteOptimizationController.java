package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/optimize")
public class RouteOptimizationController {

    @PostMapping("/{shipmentId}")
    public String optimize() {
        return "Route Optimized";
    }
}
