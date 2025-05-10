package com.ecomproject.controller;

import com.ecomproject.model.Product;
import com.ecomproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sellers/products")
public class SellerProductController {

    private final ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> getProductBySellerId(
            
    ) {}
}
