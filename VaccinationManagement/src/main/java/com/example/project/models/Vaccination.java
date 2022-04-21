package com.example.project.models;

import com.example.project.models.enumm.StatusVaccination;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Vaccination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vaccinationId;
    @Column(columnDefinition = "Time")
    private String startTime;
    @Column(columnDefinition = "Time")
    private String endTime;
    @Column(columnDefinition = "Date")
    private String date;
    @Enumerated(EnumType.ORDINAL)
    private StatusVaccination statusVaccination;
    private String description;
    private Boolean deleteFlag;
    @OneToMany(mappedBy = "vaccination")
    @JsonBackReference
    private Set<VaccinationHistory>vaccinationHistoryList;
    @ManyToOne
    @JoinColumn(name = "vaccination_type_id",nullable = false)
    private VaccinationType vaccinationType;
    @ManyToOne
    @JoinColumn(name = "location_id",nullable = false)
    private Location location;
    @ManyToOne
    @JoinColumn(name = "vaccine_id",nullable = false)
    private Vaccine vaccine;
}

