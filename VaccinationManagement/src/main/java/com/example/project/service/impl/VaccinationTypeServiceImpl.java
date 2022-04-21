package com.example.project.service.impl;

import com.example.project.models.VaccinationType;
import com.example.project.repository.VaccinationTypeRepo;
import com.example.project.service.VaccinationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationTypeServiceImpl implements VaccinationTypeService {
    @Autowired
    VaccinationTypeRepo vaccinationTypeRepo;

    @Override
    public VaccinationType findById(int id) {
        return vaccinationTypeRepo.findById(id).orElse(null);
    }

    @Override
    public void create(VaccinationType vaccinationType) {
        vaccinationTypeRepo.save(vaccinationType);
    }

    @Override
    public void update(VaccinationType vaccinationType) {
        vaccinationTypeRepo.save(vaccinationType);
    }

    @Override
    public void deleteById(int id) {
        vaccinationTypeRepo.deleteById(id);
    }

    @Override
    public List<VaccinationType> getAll() {
        return vaccinationTypeRepo.findAll();
    }
}
