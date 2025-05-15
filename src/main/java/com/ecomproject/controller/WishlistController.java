package com.ecomproject.controller;

import com.ecomproject.model.Wishlist;
import com.ecomproject.service.UserService;
import com.ecomproject.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wishlist")
public class WishlistController {

    private final WishlistService wishlistService;
    private final UserService userService;

    public ResponseEntity<Wishlist> getWishlistByUserId() {}
}
