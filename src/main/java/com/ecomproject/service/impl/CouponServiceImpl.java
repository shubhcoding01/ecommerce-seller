package com.ecomproject.service.impl;

import com.ecomproject.model.Cart;
import com.ecomproject.model.Coupon;
import com.ecomproject.model.User;
import com.ecomproject.repository.CartRepository;
import com.ecomproject.repository.CouponRepository;
import com.ecomproject.repository.UserRepository;
import com.ecomproject.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    @Override
    public Cart applyCoupon(String code, double orderValue, User user) throws Exception {
        Coupon coupon = couponRepository.findByCode(code);

        Cart cart = cartRepository.findByUserId(user.getId());

        if (coupon == null) {
            throw new Exception("Coupon Not Valid.!!");
        }
        if (user.getUsedCoupons().contains(coupon)) {
            throw new Exception("Coupon is already used !!");
        }
        if (orderValue < coupon.getMinimumOrderValue()) {
            throw new Exception("Valid for minimum order value.!!"+coupon.getMinimumOrderValue());
        }
        if (coupon.isActive() &&
                LocalDate.now().isAfter(coupon.getStartDate())
        && LocalDate.now().isBefore(coupon.getEndDate())) {

            user.getUsedCoupons().add(coupon);
            userRepository.save(user);

            double discountedPrice = (cart.getTotalSellingPrice()*coupon.getDiscountPercent())/100;
            cart.setTotalSellingPrice(cart.getTotalSellingPrice()-discountedPrice);
            cart.setCouponCode(code);
            cartRepository.save(cart);
            return cart;
        }
        throw new Exception("Invalid Coupon !!");
    }

    @Override
    public Cart removeCoupon(String code, User user) {
        Coupon coupon = couponRepository.findByCode(code);
        
        if (coupon == null) {}
        return null;
    }

    @Override
    public Coupon findCouponById(Long id) {
        return null;
    }

    @Override
    public Coupon createCoupon(Coupon coupon) {
        return null;
    }

    @Override
    public List<Coupon> findAllCoupons() {
        return List.of();
    }

    @Override
    public void deleteCoupon(Long id) {

    }
}
