package com.ecomproject.controller;

import com.ecomproject.service.CartItemService;
import com.ecomproject.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cart")
public class CartController {
    
    private final CartService cartService;
    private final CartItemService cartItemService;
}
