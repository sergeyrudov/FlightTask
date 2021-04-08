package com.spring.flight.service.impl;

import com.spring.flight.dao.CouponDAO;
import com.spring.flight.dto.CouponDTO;
import com.spring.flight.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {


    private final CouponDAO couponDAO;

    public CouponServiceImpl(CouponDAO couponDAO) {
        this.couponDAO = couponDAO;
    }

    @Override
    public double getNewPrice(CouponDTO couponDTO) {
        return couponDAO.getNewPrice(couponDTO);
    }
}
