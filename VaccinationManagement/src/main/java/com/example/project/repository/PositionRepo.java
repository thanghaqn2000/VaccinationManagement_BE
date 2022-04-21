package com.example.project.repository;

import com.example.project.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepo extends JpaRepository<Position,Integer> {
}
