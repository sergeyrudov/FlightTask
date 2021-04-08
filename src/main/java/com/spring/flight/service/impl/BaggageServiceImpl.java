package com.spring.flight.service.impl;

import com.spring.flight.dao.CheckinDAO;
import com.spring.flight.dto.CheckinDTO;
import com.spring.flight.service.BaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaggageServiceImpl implements BaggageService {


    private final CheckinDAO checkinDAO;

    public BaggageServiceImpl(CheckinDAO checkinDAO) {
        this.checkinDAO = checkinDAO;
    }


    @Override
    public int demo(CheckinDTO checkinDTO) {
        return checkinDAO.demo(checkinDTO);
    }
}
