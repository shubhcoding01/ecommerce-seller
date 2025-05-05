package com.ecomproject.request;

import lombok.Data;

@Data
public class CreateProductRequest {

    private String title;
    private String description;
    private double mrpPrice;
    private int sellingPrice;
    
}
