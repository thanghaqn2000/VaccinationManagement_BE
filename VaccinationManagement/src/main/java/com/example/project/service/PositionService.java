package com.example.project.service;

import com.example.project.models.Patient;
import com.example.project.models.Position;

import java.util.List;

public interface PositionService {
    Position findById(int id);
    void create(Position position);
    void update(Position position);
    void deleteById(int id);
    List<Position> getAll();
}
