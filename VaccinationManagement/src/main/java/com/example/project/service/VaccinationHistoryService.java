package com.example.project.service;

import com.example.project.models.VaccinationHistory;

import java.util.List;

public interface VaccinationHistoryService {
    VaccinationHistory findById(int id);
    void create(VaccinationHistory vaccinationHistory);
    void update(VaccinationHistory vaccinationHistory);
    void deleteById(int id);
    List<VaccinationHistory> getAll();
}
