package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    @PostMapping("/{vehicleId}")
    public String createShipment() {
        return "Shipment Created";
    }

    @GetMapping("/{shipmentId}")
    public String getShipment() {
        return "Shipment Found";
    }
}
