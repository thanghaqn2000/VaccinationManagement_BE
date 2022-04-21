package com.example.project.service.impl;

import com.example.project.models.Vaccination;
import com.example.project.repository.VaccinationRepo;
import com.example.project.service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationServiceImpl implements VaccinationService {
    @Autowired
    VaccinationRepo vaccinationRepo;

    @Override
    public Vaccination findById(int id) {
        return vaccinationRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Vaccination vaccination) {
        vaccinationRepo.save(vaccination);
    }

    @Override
    public void update(Vaccination vaccination) {
        vaccinationRepo.save(vaccination);
    }

    @Override
    public void deleteById(int id) {
        vaccinationRepo.deleteById(id);
    }

    @Override
    public List<Vaccination> getAll() {
        return vaccinationRepo.findAll();
    }
}
