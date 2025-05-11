package com.ecomproject.service;

import com.ecomproject.model.CartItem;

public interface CartItemService {

    CartItem updateCartItem(Long userId, Long id, CartItem cartItem);
    void removeCartItem(Long userId, Long cartItemId);
}
