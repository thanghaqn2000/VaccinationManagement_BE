package com.example.project.repository;

import com.example.project.models.Account;
import com.example.project.models.enumm.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
}
