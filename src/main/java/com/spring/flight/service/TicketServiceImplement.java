package com.spring.flight.service;

import com.spring.flight.dao.TicketRepository;
import com.spring.flight.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TicketServiceImplement implements TicketService {


    @Autowired
    private TicketRepository ticketRepository;


    @Override
    public Ticket findAllById(int id) {
        Ticket ticket = null;
        Optional<Ticket> optional = Optional.ofNullable(ticketRepository.findAllById(id));
        if(optional.isPresent()) {
            ticket = optional.get();
        }
        return ticket;
    }
}
