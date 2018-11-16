package com.pos.service;

import com.pos.model.Invoice;
import com.pos.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    private BuyerRepository buyerRepository;

    @Autowired
    public BuyerService(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    public List<Invoice> getAllInvoicesForBuyer(long buyerId) {
        return buyerRepository.findById(buyerId).get().getInvoices();
    }
}
