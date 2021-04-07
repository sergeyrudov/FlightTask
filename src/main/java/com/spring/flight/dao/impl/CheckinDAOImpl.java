package com.spring.flight.dao.impl;

import com.spring.flight.dao.CheckinDAO;
import com.spring.flight.dto.CheckinDTO;
import com.spring.flight.storage.CheckInStorage;
import org.springframework.stereotype.Repository;

@Repository
public class CheckinDAOImpl implements CheckinDAO {

    private CheckInStorage storage;

    public CheckinDAOImpl() {
        storage = new CheckInStorage();
    }

    @Override
    public int demo(CheckinDTO checkinDTO) {
        return storage.demo(checkinDTO);
    }
}
