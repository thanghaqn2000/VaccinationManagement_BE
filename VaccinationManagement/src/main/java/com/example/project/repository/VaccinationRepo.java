package com.example.project.repository;

import com.example.project.models.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepo extends JpaRepository<Vaccination,Integer> {
}
