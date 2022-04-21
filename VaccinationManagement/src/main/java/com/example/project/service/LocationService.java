package com.example.project.service;

import com.example.project.models.Invoice;
import com.example.project.models.Location;

import java.util.List;

public interface LocationService {
    Location findById(int id);
    void create(Location location);
    void update(Location location);
    void deleteById(int id);
    List<Location> getAll();
}
