package com.spring.flight.dao.impl;

import com.spring.flight.dao.TicketDAO;
import com.spring.flight.entity.Ticket;
import com.spring.flight.storage.TicketsStorage;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDAOImpl implements TicketDAO {

    private TicketsStorage storage;

    public TicketDAOImpl() {
        storage = new TicketsStorage();
    }


    @Override
    public Ticket cache(int id) {
        return storage.cache(id);
    }
}
