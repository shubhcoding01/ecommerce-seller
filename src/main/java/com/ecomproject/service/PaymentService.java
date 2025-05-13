package com.ecomproject.service;

import com.ecomproject.model.Order;
import com.ecomproject.model.PaymentOrder;
import com.ecomproject.model.User;
import com.razorpay.PaymentLink;

import java.util.Set;

public interface PaymentService {

    PaymentOrder createOrder(User user, Set<Order> orders);
    PaymentOrder getPaymentOrderById(Long orderId) throws Exception;
    PaymentOrder getPaymentOrderByPaymentId(String orderId);
    Boolean ProceedPaymentOrder(PaymentOrder paymentOrder,
                                String paymentId,
                                String paymentLinkId);
    PaymentLink createRazorpayPaymentLink(User user, Long amount,
                                          Long orderId);
    String createStripePaymentLink(User user,
                                   Long amount, Long orderId);
}
