package com.ecomproject.controller;

import com.ecomproject.model.Cart;
import com.ecomproject.model.User;
import com.ecomproject.service.CartItemService;
import com.ecomproject.service.CartService;
import com.ecomproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;
    private final CartItemService cartItemService;
    private final UserService userService;


    public ResponseEntity<Cart> findUserCartHandler(
            @RequestHeader("Authorization") String jwt) throws Exception{

        User user = userService.findUserByJwtToken(jwt);

        Cart cart = cartService.findCartUser(user);

        return new ResponseEntity<Cart>(cart, HttpStatus.OK);
    }

    

}
