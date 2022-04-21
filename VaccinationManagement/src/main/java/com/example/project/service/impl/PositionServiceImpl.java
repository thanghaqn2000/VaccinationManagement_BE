package com.example.project.service.impl;

import com.example.project.models.Position;
import com.example.project.repository.PositionRepo;
import com.example.project.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepo positionRepo;

    @Override
    public Position findById(int id) {
        return positionRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Position position) {
        positionRepo.save(position);
    }

    @Override
    public void update(Position position) {
        positionRepo.save(position);
    }

    @Override
    public void deleteById(int id) {
        positionRepo.deleteById(id);
    }

    @Override
    public List<Position> getAll() {
        return positionRepo.findAll();
    }
}
