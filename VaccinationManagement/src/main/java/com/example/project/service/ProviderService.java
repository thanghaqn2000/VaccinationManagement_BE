package com.example.project.service;

import com.example.project.models.Position;
import com.example.project.models.Provider;

import java.util.List;

public interface ProviderService {
    Provider findById(int id);
    void create(Provider provider);
    void update(Provider provider);
    void deleteById(int id);
    List<Provider> getAll();
}
