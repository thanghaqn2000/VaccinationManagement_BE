package com.example.project.service;

import com.example.project.models.Provider;
import com.example.project.models.Role;

import java.util.List;

public interface RoleService {
    Role findById(int id);
    void create(Role role);
    void update(Role role);
    void deleteById(int id);
    List<Role> getAll();
}
