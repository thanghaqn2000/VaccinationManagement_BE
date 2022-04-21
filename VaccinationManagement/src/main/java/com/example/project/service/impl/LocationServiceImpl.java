package com.example.project.service.impl;

import com.example.project.models.Location;
import com.example.project.repository.LocationRepo;
import com.example.project.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepo locationRepo;

    @Override
    public Location findById(int id) {
        return locationRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Location location) {
        locationRepo.save(location);
    }

    @Override
    public void update(Location location) {
        locationRepo.save(location);
    }

    @Override
    public void deleteById(int id) {
        locationRepo.deleteById(id);
    }

    @Override
    public List<Location> getAll() {
        return locationRepo.findAll();
    }
}
