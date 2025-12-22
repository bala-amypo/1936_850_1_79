package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.LocationService;

@Service   // ⭐ VERY IMPORTANT
public class LocationServiceImpl implements LocationService {

    @Override
    public void createLocation() {
        System.out.println("Location created");
    }
}
