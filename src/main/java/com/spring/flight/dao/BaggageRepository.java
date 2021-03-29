package com.spring.flight.dao;

import com.spring.flight.entity.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaggageRepository extends JpaRepository<Baggage, Integer> {
    public Baggage findAllByDestinationIdAndBaggageId(int destinationId, int baggageId);
}
