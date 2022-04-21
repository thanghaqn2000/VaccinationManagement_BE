package com.example.project.service.impl;

import com.example.project.models.VaccinationHistory;
import com.example.project.repository.VaccinationHistoryRepo;
import com.example.project.service.VaccinationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationHistoryServiceImpl implements VaccinationHistoryService {
    @Autowired
    VaccinationHistoryRepo vaccinationHistoryRepo;

    @Override
    public VaccinationHistory findById(int id) {
        return vaccinationHistoryRepo.findById(id).orElse(null);
    }

    @Override
    public void create(VaccinationHistory vaccinationHistory) {
        vaccinationHistoryRepo.save(vaccinationHistory);
    }

    @Override
    public void update(VaccinationHistory vaccinationHistory) {
        vaccinationHistoryRepo.save(vaccinationHistory);
    }

    @Override
    public void deleteById(int id) {
        vaccinationHistoryRepo.deleteById(id);
    }

    @Override
    public List<VaccinationHistory> getAll() {
        return vaccinationHistoryRepo.findAll();
    }
}
