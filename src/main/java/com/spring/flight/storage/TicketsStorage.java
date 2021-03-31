package com.spring.flight.storage;

import com.spring.flight.entity.Ticket;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class TicketsStorage {

    private Set<Ticket> tickets;

    public TicketsStorage() {
        tickets = new HashSet<>();
        fillTicketData();
    }

    public Ticket getTicketById(int id) {
        return tickets
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("There isn't ticket with id = " + id));
    }

    private void fillTicketData() {
        tickets.add(new Ticket(1, true));
        tickets.add(new Ticket(2, false));
        tickets.add(new Ticket(3, true));
        tickets.add(new Ticket(4, false));
        tickets.add(new Ticket(5, true));
    }
}
