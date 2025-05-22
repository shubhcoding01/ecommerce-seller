package com.ecomproject.controller;

import com.ecomproject.model.Cart;
import com.ecomproject.service.CartService;
import com.ecomproject.service.CouponService;
import com.ecomproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AdminCouponController {

    private final CouponService couponService;
    private final UserService userService;
    private final CartService cartService;

    public ResponseEntity<Cart> applyCoupon(Cart cart) {}
}
