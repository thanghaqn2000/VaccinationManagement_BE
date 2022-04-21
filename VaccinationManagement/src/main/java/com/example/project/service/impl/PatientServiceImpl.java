package com.example.project.service.impl;

import com.example.project.models.Patient;
import com.example.project.repository.PatientRepo;
import com.example.project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepo patientRepo;

    @Override
    public Patient findById(int id) {
        return patientRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Patient patient) {
        patientRepo.save(patient);
    }

    @Override
    public void update(Patient patient) {
        patientRepo.save(patient);
    }

    @Override
    public void deleteById(int id) {
        patientRepo.deleteById(id);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepo.findAll();
    }
}
