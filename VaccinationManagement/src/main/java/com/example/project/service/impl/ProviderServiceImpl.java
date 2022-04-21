package com.example.project.service.impl;

import com.example.project.models.Provider;
import com.example.project.repository.ProviderRepo;
import com.example.project.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    ProviderRepo providerRepo;

    @Override
    public Provider findById(int id) {
        return providerRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Provider provider) {
        providerRepo.save(provider);
    }

    @Override
    public void update(Provider provider) {
        providerRepo.save(provider);
    }

    @Override
    public void deleteById(int id) {
        providerRepo.deleteById(id);
    }

    @Override
    public List<Provider> getAll() {
        return providerRepo.findAll();
    }
}
