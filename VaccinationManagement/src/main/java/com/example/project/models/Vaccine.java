package com.example.project.models;

import com.example.project.models.enumm.StatusVaccine;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vaccineId;
    private String name;
    private String licenseCode;
    private String origin;
    private String age;
    private String maintenance;
    private String image;
    private Double dosage;
    @Column(columnDefinition = "Date")
    private String expired;
    private Long quantity;
    private Boolean deleteFlag;
    @Enumerated(EnumType.ORDINAL)
    private StatusVaccine statusVaccine;

    @OneToMany(mappedBy = "vaccine")
    @JsonBackReference
    private Set<Invoice> invoiceList;
    @ManyToOne
    @JoinColumn(name = "vaccine_type_id", nullable = false)
    private VaccineType vaccineType;
    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private Provider provider;
    @OneToMany(mappedBy = "vaccine")
    @JsonBackReference
    private Set<Vaccination> vaccinationList;
    @OneToMany(mappedBy = "vaccine")
    @JsonBackReference
    private Set<Storage> storageList;;
}
