package com.ecomproject.service;

import com.ecomproject.model.Cart;
import com.ecomproject.model.Coupon;
import com.ecomproject.model.User;

public interface CouponService {

    Cart applyCoupon(String code,double orderValue, User user);
    Cart removeCoupon(String code,User user);
    Coupon findCouponById(Long id);
}
