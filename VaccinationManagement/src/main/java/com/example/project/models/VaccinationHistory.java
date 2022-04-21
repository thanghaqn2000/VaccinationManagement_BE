package com.example.project.models;


import com.example.project.models.enumm.Status;
import com.example.project.models.enumm.StatusVaccinationHistory;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity(name = "vaccination_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vaccinationHistoryId;
    @Enumerated(EnumType.ORDINAL)
    private StatusVaccinationHistory statusVaccinationHistory;
    private Double dosage;
    private String preStatus;
    private String afterStatus;
    private Integer vaccinationTimes;
    private Boolean deleteFlag = false;
    @Column(columnDefinition = "Time")
    private String startTime;
    @Column(columnDefinition = "Time")
    private String endTime;

    @ManyToOne
    @JoinColumn(name = "vaccination_id",nullable = false)
    private Vaccination vaccination;

    @ManyToOne
    @JoinColumn(name = "patient_id",nullable = false)
    private Patient patient;
}
