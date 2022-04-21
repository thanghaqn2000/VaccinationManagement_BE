package com.example.project.service;

import com.example.project.models.Account;

import java.util.List;

public interface AccountService {
    Account findById(int id);
    void create(Account account);
    void update(Account account);
    void deleteById(int id);
    List<Account> getAll();
}
