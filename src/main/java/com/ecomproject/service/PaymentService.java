package com.ecomproject.service;

import com.ecomproject.model.Order;
import com.ecomproject.model.PaymentOrder;
import com.ecomproject.model.User;

import java.util.Set;

public interface PaymentService {

    PaymentOrder createOrder(User user, Set<Order> orders);
    PaymentOrder getPaymentOrderById(String orderId);
    PaymentOrder getPaymentOrderByPaymentId(String orderId);
    Boolean ProceedPaymentOrder(PaymentOrder paymentOrder,
                                String paymentId,
                                String paymentLinkId);
    
}
