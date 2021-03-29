package com.spring.flight.controller;

import com.spring.flight.entity.Baggage;
import com.spring.flight.service.BaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BaggageController {

    @Autowired
    private BaggageService baggageService;

    @PostMapping("/baggage")
    public Baggage findAllByDestinationIdAndBaggageId(@RequestBody Baggage baggage) {
        return baggageService.findAllByDestinationIdAndBaggageId(baggage.getDestinationId(), baggage.getDestinationId());
    }
}
