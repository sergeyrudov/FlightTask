package com.spring.flight.service.impl;

import com.spring.flight.dao.TicketDAO;
import com.spring.flight.entity.Ticket;
import com.spring.flight.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {


    private final TicketDAO ticketDAO;

    public TicketServiceImpl(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }


    @Override
    public Ticket cache(int id) {
        return ticketDAO.cache(id);
    }
}
