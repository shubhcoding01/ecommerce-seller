package com.ecomproject.service.impl;

import com.ecomproject.model.Product;
import com.ecomproject.model.User;
import com.ecomproject.model.Wishlist;
import com.ecomproject.repository.WishlistRepository;
import com.ecomproject.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishlistServiceImpl implements WishlistService {

    private final WishlistRepository wishlistRepository;

    @Override
    public Wishlist createWishlist(User user) {
        Wishlist wishlist = new Wishlist();
        return null;
    }

    @Override
    public Wishlist getWishlistUserId(User user) {
        return null;
    }

    @Override
    public Wishlist addProductToWishlist(Wishlist wishlist, Product product) {
        return null;
    }
}
