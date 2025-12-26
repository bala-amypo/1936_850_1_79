package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "route_optimization_result")
public class RouteOptimizationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Shipment shipment;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;

    private LocalDateTime generatedAt;

    public RouteOptimizationResult() {}

    @PrePersist
    public void onCreate() {
        this.generatedAt = LocalDateTime.now();
    }

    // ===== BUILDER =====
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final RouteOptimizationResult r = new RouteOptimizationResult();

        public Builder id(Long id) {
            r.setId(id);
            return this;
        }

        public Builder shipment(Shipment shipment) {
            r.setShipment(shipment);
            return this;
        }

        public Builder optimizedDistanceKm(Double optimizedDistanceKm) {
            r.setOptimizedDistance
