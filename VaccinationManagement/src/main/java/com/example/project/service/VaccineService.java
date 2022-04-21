package com.example.project.service;

import com.example.project.models.VaccinationType;
import com.example.project.models.Vaccine;

import java.util.List;

public interface VaccineService {
    Vaccine findById(int id);
    void create(Vaccine vaccine);
    void update(Vaccine vaccine);
    void deleteById(int id);
    List<Vaccine> getAll();
}
