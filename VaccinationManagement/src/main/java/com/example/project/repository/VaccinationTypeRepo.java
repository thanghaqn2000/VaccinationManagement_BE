package com.example.project.repository;

import com.example.project.models.VaccinationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationTypeRepo extends JpaRepository<VaccinationType,Integer> {
}
