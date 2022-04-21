package com.example.project.service.impl;

import com.example.project.models.Vaccine;
import com.example.project.repository.VaccineRepo;
import com.example.project.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineServiceImpl implements VaccineService {
    @Autowired
    VaccineRepo vaccineRepo;

    @Override
    public Vaccine findById(int id) {
        return vaccineRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Vaccine vaccine) {
        vaccineRepo.save(vaccine);
    }

    @Override
    public void update(Vaccine vaccine) {
        vaccineRepo.save(vaccine);
    }

    @Override
    public void deleteById(int id) {
        vaccineRepo.deleteById(id);
    }

    @Override
    public List<Vaccine> getAll() {
        return vaccineRepo.findAll();
    }
}
