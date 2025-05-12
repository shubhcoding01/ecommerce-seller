package com.ecomproject.controller;

import com.ecomproject.domain.PaymentMethod;
import com.ecomproject.model.Address;
import com.ecomproject.response.PaymentLinkResponse;
import com.ecomproject.service.CartService;
import com.ecomproject.service.OrderService;
import com.ecomproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;
    private final UserService userService;
    private final CartService cartService;

    @PostMapping
    public ResponseEntity<PaymentLinkResponse> createOrderHandler(
            @RequestBody Address shippingAddress,
            @RequestParam PaymentMethod paymentMethod,
            @RequestHeader("Authorization")String jwt)
        throws Exception {

    }
}
