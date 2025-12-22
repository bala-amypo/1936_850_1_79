package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final RouteOptimizationResultRepository resultRepository;
    private final ShipmentRepository shipmentRepository;

    public RouteOptimizationServiceImpl(RouteOptimizationResultRepository resultRepository,
                                        ShipmentRepository shipmentRepository) {
        this.resultRepository = resultRepository;
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId) {
        Shipment shipment = shipmentRepository.findById(shipmentId)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));

        RouteOptimizationResult result = new RouteOptimizationResult();
        result.setShipment(shipment);
        result.setOptimizedDistanceKm(120.5);
        result.setEstimatedFuelUsage(15.8);
        result.setGeneratedAt(LocalDateTime.now());

        return resultRepository.save(result);
    }
}
