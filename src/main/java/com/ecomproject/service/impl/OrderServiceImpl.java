package com.ecomproject.service.impl;

import com.ecomproject.model.*;
import com.ecomproject.service.OrderService;

import java.util.List;
import java.util.Set;

public class OrderServiceImpl implements OrderService {
    @Override
    public Set<Order> createOrders(User user, Address shippingAddress, Cart cart) {
        return Set.of();
    }

    @Override
    public Order findOrderById(long id) {
        return null;
    }

    @Override
    public List<Order> usersOrderHistory(Long userId) {
        return List.of();
    }

    @Override
    public List<Order> sellersOrder(Long sellerId) {
        return List.of();
    }

    @Override
    public Order updateOrderStatus(Long orderId, OrderStatus orderStatus) {
        return null;
    }

    @Override
    public Order cancelOrder(Long orderId, User user) {
        return null;
    }
}
