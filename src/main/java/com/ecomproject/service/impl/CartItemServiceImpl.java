package com.ecomproject.service.impl;

import com.ecomproject.model.CartItem;
import com.ecomproject.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {
    @Override
    public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) {
        return null;
    }

    @Override
    public void removeCartItem(Long userId, Long cartItemId) {

    }

    @Override
    public CartItem findCartItemById(Long id) {
        return null;
    }
}
