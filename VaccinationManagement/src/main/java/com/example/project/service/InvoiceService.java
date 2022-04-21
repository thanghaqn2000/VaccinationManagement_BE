package com.example.project.service;

import com.example.project.models.Employee;
import com.example.project.models.Invoice;

import java.util.List;

public interface InvoiceService {
    Invoice findById(int id);
    void create(Invoice invoice);
    void update(Invoice invoice);
    void deleteById(int id);
    List<Invoice> getAll();
}
