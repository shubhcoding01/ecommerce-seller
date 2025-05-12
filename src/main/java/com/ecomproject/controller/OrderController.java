package com.ecomproject.controller;

import com.ecomproject.domain.PaymentMethod;
import com.ecomproject.model.*;
import com.ecomproject.response.PaymentLinkResponse;
import com.ecomproject.service.CartService;
import com.ecomproject.service.OrderService;
import com.ecomproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

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

        User user = userService.findUserByJwtToken(jwt);
        Cart cart = cartService.findCartUser(user);
        Set<Order> orders = orderService.createOrders(user, shippingAddress,cart);

//        PaymentOrder paymentOrder = paymentService.createOrder(user,orders);

        PaymentLinkResponse paymentLinkResponse = new PaymentLinkResponse();

//        if(paymentMethod.equals(PaymentMethod.RAZORPAY)){
//            PaymentLink payment = paymentService.createRazorPayPaymentLink(user,
//                    paymentOrder.getAmount(),
//                    paymentOrder.getId());
//            String paymentUrl = payment.get("short_url");
//            String paymentUrlId = payment.get("id");
//
//
//            paymentLinkResponse.setPaymentLinkUrl(paymentUrl);
//            paymentLinkResponse.setPaymentLinkId(paymentUrlId);
//            paymentOrder.setPaymentLinkId(paymentUrlId);
//            paymentOrderRepository.save(paymentOrder);
//        }
//        else {
//            String paymentUrl = paymentService.createStripePaymentLink(user,
//                    paymentOrder.getAmount(),
//                    paymentOrder.getId());
//            paymentLinkResponse.setPaymentLinkUrl(paymentUrl);
//        }
        return new ResponseEntity<>(paymentLinkResponse, HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<List<Order>> usersOrderHistoryHandler(
            @RequestHeader("Authorization")
            String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
    }
}
