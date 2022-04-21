package com.example.project.service.impl;

import com.example.project.models.Invoice;
import com.example.project.repository.InvoiceRepo;
import com.example.project.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    InvoiceRepo invoiceRepo;

    @Override
    public Invoice findById(int id) {
        return invoiceRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Invoice invoice) {
        invoiceRepo.save(invoice);
    }

    @Override
    public void update(Invoice invoice) {
        invoiceRepo.save(invoice);
    }

    @Override
    public void deleteById(int id) {
        invoiceRepo.deleteById(id);
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceRepo.findAll();
    }
}
