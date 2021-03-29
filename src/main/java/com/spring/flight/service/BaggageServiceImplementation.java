package com.spring.flight.service;

import com.spring.flight.dao.BaggageRepository;
import com.spring.flight.entity.Baggage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class BaggageServiceImplementation implements BaggageService {

    @Autowired
    private BaggageRepository baggageRepository;


    @Override
    public Baggage findAllByDestinationIdAndBaggageId(int destinationId, int baggageId) {
        Baggage baggage = null;
        Optional<Baggage> optional = Optional.ofNullable(baggageRepository.findAllByDestinationIdAndBaggageId(destinationId, baggageId));
        if(optional.isPresent()) {
            baggage = optional.get();
        }
        return baggage;
    }
}
