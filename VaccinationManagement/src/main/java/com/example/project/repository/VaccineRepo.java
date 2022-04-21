package com.example.project.repository;

import com.example.project.models.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepo extends JpaRepository<Vaccine,Integer> {
}
