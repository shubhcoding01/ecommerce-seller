package com.ecomproject.controller;

import com.ecomproject.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminController {

    private final SellerService sellerService;
}
