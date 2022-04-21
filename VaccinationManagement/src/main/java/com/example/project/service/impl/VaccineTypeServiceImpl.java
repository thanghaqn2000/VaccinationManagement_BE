package com.example.project.service.impl;

import com.example.project.models.VaccineType;
import com.example.project.repository.VaccineTypeRepo;
import com.example.project.service.VaccineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineTypeServiceImpl implements VaccineTypeService {
    @Autowired
    VaccineTypeRepo vaccineTypeRepo;

    @Override
    public VaccineType findById(int id) {
        return vaccineTypeRepo.findById(id).orElse(null);
    }

    @Override
    public void create(VaccineType vaccineType) {
        vaccineTypeRepo.save(vaccineType);
    }

    @Override
    public void update(VaccineType vaccineType) {
        vaccineTypeRepo.save(vaccineType);
    }

    @Override
    public void deleteById(int id) {
        vaccineTypeRepo.deleteById(id);
    }

    @Override
    public List<VaccineType> getAll() {
        return vaccineTypeRepo.findAll();
    }
}
