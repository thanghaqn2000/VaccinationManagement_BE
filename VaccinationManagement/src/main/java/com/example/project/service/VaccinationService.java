package com.example.project.service;

import com.example.project.models.Vaccination;
import com.example.project.models.Vaccine;

import java.util.List;

public interface VaccinationService {
    Vaccination findById(int id);
    void create(Vaccination vaccination);
    void update(Vaccination vaccination);
    void deleteById(int id);
    List<Vaccination> getAll();
}
