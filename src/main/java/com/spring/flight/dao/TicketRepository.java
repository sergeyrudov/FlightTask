package com.spring.flight.dao;

import com.spring.flight.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    public Ticket findAllById(int id);

}
