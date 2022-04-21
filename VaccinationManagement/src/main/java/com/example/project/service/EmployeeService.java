package com.example.project.service;

import com.example.project.models.Account;
import com.example.project.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(int id);
    void create(Employee employee);
    void update(Employee employee);
    void deleteById(int id);
    List<Employee> getAll();
}
