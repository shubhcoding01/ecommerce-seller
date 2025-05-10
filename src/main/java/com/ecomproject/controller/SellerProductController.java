package com.ecomproject.controller;

import com.ecomproject.exceptions.ProductException;
import com.ecomproject.exceptions.SellerException;
import com.ecomproject.model.Product;
import com.ecomproject.model.Seller;
import com.ecomproject.service.ProductService;
import com.ecomproject.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sellers/products")
public class SellerProductController {

    private final ProductService productService;
    private final SellerService sellerService;

    @GetMapping()
    public ResponseEntity<List<Product>> getProductBySellerId(
          @RequestHeader("Authorization") String jwt) throws Exception {
        Seller seller = sellerService.getSellerProfile(jwt);

        List<Product> products = productService.getProductsBySellerId(seller.getId());
        return new ResponseEntity<>(products,HttpStatus.OK);

    }

    public ResponseEntity<Product> createProduct(
            
    )
}
