package com.spring.flight.dao.impl;

import com.spring.flight.dao.CouponDAO;
import com.spring.flight.dto.CouponDTO;
import com.spring.flight.storage.CouponStorage;
import org.springframework.stereotype.Repository;

@Repository
public class CouponDAOImpl implements CouponDAO {

    private CouponStorage storage;

    public CouponDAOImpl() {
        storage = new CouponStorage();
    }

    @Override
    public double getNewPrice(CouponDTO couponDTO) {
        return storage.getNewPrice(couponDTO);
    }
}
