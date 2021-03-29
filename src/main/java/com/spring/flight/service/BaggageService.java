package com.spring.flight.service;

import com.spring.flight.entity.Baggage;
import com.spring.flight.entity.Ticket;

public interface BaggageService {

    public Baggage findAllByDestinationIdAndBaggageId(int destinationId, int baggageId);

}
