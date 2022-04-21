package com.example.project.repository;

import com.example.project.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepo extends JpaRepository<Provider,Integer> {
}
