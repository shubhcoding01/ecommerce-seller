package com.ecomproject.controller;

import com.ecomproject.model.Transaction;
import com.ecomproject.service.SellerService;
import com.ecomproject.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;
    private final SellerService sellerService;

    public ResponseEntity<List<Transaction>> getTransactionBySeller() {}
}

