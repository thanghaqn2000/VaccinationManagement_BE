package com.example.project.service.impl;

import com.example.project.models.Account;
import com.example.project.repository.AccountRepo;
import com.example.project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepo accountRepo;

    @Override
    public Account findById(int id) {
        return accountRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void update(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void deleteById(int id) {
        accountRepo.deleteById(id);
    }

    @Override
    public List<Account> getAll() {
        return accountRepo.findAll();
    }
}
