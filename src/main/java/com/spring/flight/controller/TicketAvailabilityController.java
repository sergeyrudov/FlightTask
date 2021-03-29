package com.spring.flight.controller;


import com.spring.flight.entity.Ticket;
import com.spring.flight.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TicketAvailabilityController {

    @Autowired
    private TicketService ticketService;


    @GetMapping("/tickets/id/{id}")
    public Ticket findTicketById(@PathVariable int id) {
        Ticket ticket = ticketService.findAllById(id);
        if(ticket.getEnabled()) {
            return ticket;
        } else {
            return null;
        }
    }
}
