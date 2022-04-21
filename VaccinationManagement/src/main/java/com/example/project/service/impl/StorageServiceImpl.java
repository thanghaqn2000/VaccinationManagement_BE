package com.example.project.service.impl;

import com.example.project.models.Storage;
import com.example.project.repository.StorageRepo;
import com.example.project.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    StorageRepo storageRepo;

    @Override
    public Storage findById(int id) {
        return storageRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Storage storage) {
        storageRepo.save(storage);
    }

    @Override
    public void update(Storage storage) {
        storageRepo.save(storage);
    }

    @Override
    public void deleteById(int id) {
        storageRepo.deleteById(id);
    }

    @Override
    public List<Storage> getAll() {
        return storageRepo.findAll();
    }
}
