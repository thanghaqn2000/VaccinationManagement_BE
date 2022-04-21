package com.example.project.repository;

import com.example.project.models.VaccinationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationHistoryRepo extends JpaRepository<VaccinationHistory,Integer> {
}
