package com.example.project.repository;

import com.example.project.models.VaccineType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineTypeRepo extends JpaRepository<VaccineType,Integer> {
}
