package com.example.project.service;

import com.example.project.models.Vaccine;
import com.example.project.models.VaccineType;

import java.util.List;

public interface VaccineTypeService {
    VaccineType findById(int id);
    void create(VaccineType vaccineType);
    void update(VaccineType vaccineType);
    void deleteById(int id);
    List<VaccineType> getAll();
}
