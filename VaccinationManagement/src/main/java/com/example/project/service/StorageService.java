package com.example.project.service;

import com.example.project.models.Role;
import com.example.project.models.Storage;

import java.util.List;

public interface StorageService {
    Storage findById(int id);
    void create(Storage storage);
    void update(Storage storage);
    void deleteById(int id);
    List<Storage> getAll();
}
