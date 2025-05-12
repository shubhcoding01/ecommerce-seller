package com.ecomproject.service.impl;

import com.ecomproject.model.*;
import com.ecomproject.repository.AddressRepository;
import com.ecomproject.repository.OrderRepository;
import com.ecomproject.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final AddressRepository addressRepository;

    @Override
    public Set<Order> createOrders(User user, Address shippingAddress, Cart cart) {

        if(!user.getAddresses().contains(shippingAddress)) {
            user.getAddresses().add(shippingAddress);
        }
        Address address = addressRepository.save(shippingAddress);

        Map<Long, List<CartItem>> itemsBySeller = cart.getCartItems().stream()
                .collect(Collectors.groupingBy(item->item.getProduct()
                        .getSeller().getId()));
        Set<Order> orders = new HashSet<>();

        for (Map.Entry<Long, List<CartItem>> entry : itemsBySeller.entrySet()) {
            Long sellerId = entry.getKey();
            List<CartItem> items = entry.getValue();

            int totalOrderPrice = items.stream().mapToInt(
                    CartItem::getSellingPrice
            ).sum();
            int totalItem = items.stream().mapToInt(CartItem::getQuantity).sum();

            Order order = new Order();
        }

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
