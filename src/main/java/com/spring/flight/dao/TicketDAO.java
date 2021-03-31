package com.spring.flight.dao;

import com.spring.flight.entity.Ticket;

public interface TicketDAO {

    public Ticket findById(int id);
}
