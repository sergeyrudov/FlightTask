package com.spring.flight.dao;

import com.spring.flight.dto.CouponDTO;


public interface CouponDAO {

    public double getNewPrice(CouponDTO couponDTO);
}
