package com.example.project.models;

import com.example.project.models.enumm.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String userName;
    private String password;
    @Enumerated(EnumType.ORDINAL)
    private Status status;
    private String confirm_token;
    private String email;
    @OneToMany(mappedBy = "account")
    private Set<AccountRole> accountRoleList;
    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private Patient patient;
}
