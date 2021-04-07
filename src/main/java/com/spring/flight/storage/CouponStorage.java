package com.spring.flight.storage;

import com.spring.flight.dto.CouponDTO;
import com.spring.flight.entity.Coupon;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CouponStorage {

    private List<Coupon> coupons;

    public CouponStorage() {
        coupons = new ArrayList<>();
        fillCouponDataData();
    }

    public Coupon getCouponById(int id) {
        return coupons
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There isn't coupon with id = " + id));
    }

    private void fillCouponDataData() {
        coupons.add(new Coupon(1, 100.1d));
        coupons.add(new Coupon(2, 200.5d));
        coupons.add(new Coupon(3, 300.6d));
        coupons.add(new Coupon(4, 400.7d));
        coupons.add(new Coupon(5, 500.8d));
    }


    public double getNewPrice(CouponDTO couponDTO) {
        Coupon coupon = getCouponById(couponDTO.getId());
        return (couponDTO.getPrice() * coupon.getDiscount()) / 100;
    }
}
