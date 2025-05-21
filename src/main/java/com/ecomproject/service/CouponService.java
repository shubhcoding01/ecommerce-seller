package com.ecomproject.service;

import com.ecomproject.model.Cart;
import com.ecomproject.model.User;

public interface CouponService {

    Cart applyCoupon(String code,double orderValue, User user);
}
