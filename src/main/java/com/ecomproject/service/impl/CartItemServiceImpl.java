package com.ecomproject.service.impl;

import com.ecomproject.model.CartItem;
import com.ecomproject.model.User;
import com.ecomproject.repository.CartItemRepository;
import com.ecomproject.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {

    private final CartItemRepository cartItemRepository;

    @Override
    public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws Exception {
        CartItem item = findCartItemById(id);

        User cartItemUser = item.getCart().getUser();

        if(cartItemUser.getId().equals(userId)) {
            item.setQuantity(cartItem.getQuantity());
            item.setMrpPrice(item.getQuantity()*item.getProduct().getMrpprice());
            item.setSellingPrice(item.getQuantity()*item.getProduct().getSellingprice());
            return cartItemRepository.save(item);
        }
        throw new Exception("You can't Update this cart-Item");
    }

    @Override
    public void removeCartItem(Long userId, Long cartItemId) {

        CartItem item = findCartItemById(cartItemId);

        User cartItemUser = item.getCart().getUser();

        if(cartItemUser.getId().equals(userId)) {
            cartItemRepository.delete(item);
        }
    }

    @Override
    public CartItem findCartItemById(Long id) {
        return null;
    }
}
