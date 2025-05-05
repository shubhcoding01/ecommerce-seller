package com.ecomproject.service;

import com.ecomproject.model.Product;
import com.ecomproject.model.Seller;

public interface ProductService {

    public Product createProduct(CreateProductRequest req, Seller seller);
}
