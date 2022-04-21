package com.example.project.service.impl;

import com.example.project.models.Role;
import com.example.project.repository.RoleRepo;
import com.example.project.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepo roleRepo;

    @Override
    public Role findById(int id) {
        return roleRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Role role) {
        roleRepo.save(role);
    }

    @Override
    public void update(Role role) {
        roleRepo.save(role);
    }

    @Override
    public void deleteById(int id) {
        roleRepo.deleteById(id);
    }

    @Override
    public List<Role> getAll() {
        return roleRepo.findAll();
    }
}
