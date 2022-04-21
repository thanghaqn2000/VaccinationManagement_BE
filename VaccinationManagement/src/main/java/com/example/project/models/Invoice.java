package com.example.project.models;

import com.example.project.models.enumm.Status;
import com.example.project.models.enumm.StatusInvoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;
    @Column(columnDefinition = "DateTime")
    private String vaccinationDate;
    private Long price;
    private String provider;
    private Boolean deleteFlag;
    private int quantity;
    @Enumerated(EnumType.ORDINAL)
    private StatusInvoice statusInvoice;
    @ManyToOne
    @JoinColumn(name = "vaccine_id",nullable = false)
    private Vaccine vaccine;
}
