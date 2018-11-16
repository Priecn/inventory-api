package com.pos.controller;

import com.pos.model.Invoice;
import com.pos.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    private BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/{buyerId}/invoice")
    public List<Invoice> getAllInvoices(@PathVariable long buyerId) {
        return buyerService.getAllInvoicesForBuyer(buyerId);
    }
}
