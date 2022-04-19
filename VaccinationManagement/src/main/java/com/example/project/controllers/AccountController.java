package com.example.project.controllers;

import com.example.project.models.Account;
import com.example.project.models.enumm.Status;
import com.example.project.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    AccountRepo accountRepo;
    @GetMapping("/save")
    public ResponseEntity<?> save(){
        Account account = new Account();
        account.setUserName("thang");
        account.setStatus(Status.APPROVED);
        accountRepo.save(account);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/find-id/{id}")
    public ResponseEntity<Account> save(@PathVariable int id){
        Account account = accountRepo.findById(id).orElse(null);
        System.out.println(account.getStatus().equals(Status.OPEN));
        return new ResponseEntity<Account>(account, HttpStatus.FOUND);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Account>> list(){
        return new ResponseEntity<List<Account>>(accountRepo.findAll(), HttpStatus.FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Account account){
        accountRepo.save(account);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> edit(@RequestBody Account account){
        accountRepo.save(account);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        accountRepo.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
