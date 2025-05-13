package com.ecomproject.service.impl;

import com.ecomproject.model.Order;
import com.ecomproject.model.PaymentOrder;
import com.ecomproject.model.User;
import com.ecomproject.repository.OrderRepository;
import com.ecomproject.repository.PaymentOrderRepository;
import com.ecomproject.service.PaymentService;
import com.razorpay.PaymentLink;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private PaymentOrderRepository paymentOrderRepository;
    private OrderRepository orderRepository;

    @Override
    public PaymentOrder createOrder(User user, Set<Order> orders) {
        
        return null;
    }

    @Override
    public PaymentOrder getPaymentOrderById(String orderId) {
        return null;
    }

    @Override
    public PaymentOrder getPaymentOrderByPaymentId(String orderId) {
        return null;
    }

    @Override
    public Boolean ProceedPaymentOrder(PaymentOrder paymentOrder, String paymentId, String paymentLinkId) {
        return null;
    }

    @Override
    public PaymentLink createRazorpayPaymentLink(User user, Long amount, Long orderId) {
        return null;
    }

    @Override
    public String createStripePaymentLink(User user, Long amount, Long orderId) {
        return "";
    }
}
