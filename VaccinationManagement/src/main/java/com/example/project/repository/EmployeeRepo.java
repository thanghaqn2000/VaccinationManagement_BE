package com.example.project.repository;

import com.example.project.models.Account;
import com.example.project.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
