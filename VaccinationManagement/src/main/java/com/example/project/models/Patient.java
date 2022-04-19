package com.example.project.models;

import com.example.project.models.enumm.Gender;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String name;
    private String phoneNumber;
    private String email;
    private Date dateOfBirth;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    private boolean deleteFlag;
    private String address;
    @OneToOne
    @JoinColumn(name = "account_id",unique = true)
    @NotNull
    private Account account;
    @OneToMany(mappedBy = "patient")
    @JsonBackReference
    private Set<VaccinationHistory> vaccinationHistoryList;
}
