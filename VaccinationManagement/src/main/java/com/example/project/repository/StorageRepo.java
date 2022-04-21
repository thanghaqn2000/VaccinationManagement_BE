package com.example.project.repository;

import com.example.project.models.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepo extends JpaRepository<Storage,Integer> {
}
