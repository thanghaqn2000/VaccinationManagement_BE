package com.example.project.service;

import com.example.project.models.Location;
import com.example.project.models.Patient;

import java.util.List;

public interface PatientService {
    Patient findById(int id);
    void create(Patient patient);
    void update(Patient patient);
    void deleteById(int id);
    List<Patient> getAll();
}
