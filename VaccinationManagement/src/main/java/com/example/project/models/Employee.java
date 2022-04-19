package com.example.project.models;

import com.example.project.models.enumm.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String name;
    private String phoneNumber;
    private String email;
    private Date dateOfBirth;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    private boolean deleteFlag;
    private String address;
    private String idCard;
    private String image;
    @OneToOne
    @JoinColumn(name = "account_id",unique = true)
    @NotNull
    private Account account;;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}
