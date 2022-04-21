package com.example.project.service.impl;

import com.example.project.models.Employee;
import com.example.project.repository.AccountRepo;
import com.example.project.repository.EmployeeRepo;
import com.example.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee findById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }
}
