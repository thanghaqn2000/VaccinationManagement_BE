package com.example.project.repository;

import com.example.project.models.Account;
import com.example.project.models.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRoleRepo extends JpaRepository<AccountRole,Integer> {
}
