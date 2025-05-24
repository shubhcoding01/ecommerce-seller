package com.ecomproject.controller;

import com.ecomproject.model.Seller;
import com.ecomproject.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminController {

    private final SellerService sellerService;

    @PatchMapping()
    public ResponseEntity<Seller> updateSellerStatus()
}
