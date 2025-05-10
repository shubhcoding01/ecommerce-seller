package com.ecomproject.controller;

import com.ecomproject.exceptions.ProductException;
import com.ecomproject.model.Product;
import com.ecomproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ResponseEntity<Product> getProductById(
            @PathVariable long productId)
    throws ProductException
    {
        
    }
}
