package com.example.project.service;

import com.example.project.models.VaccinationType;
import com.example.project.models.Vaccine;

import java.util.List;

public interface VaccinationTypeService {
    VaccinationType findById(int id);
    void create(VaccinationType vaccinationType);
    void update(VaccinationType vaccinationType);
    void deleteById(int id);
    List<VaccinationType> getAll();
}
