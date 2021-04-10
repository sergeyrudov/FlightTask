package com.spring.flight.controller;


import com.spring.flight.dto.CheckinDTO;
import com.spring.flight.dto.CouponDTO;
import com.spring.flight.entity.Ticket;
import com.spring.flight.service.BaggageService;
import com.spring.flight.service.CouponService;
import com.spring.flight.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class FlightController {

    private final TicketService ticketService;

    private final CouponService couponService;

    private final BaggageService baggageService;

    public FlightController(TicketService ticketService, CouponService couponService, BaggageService baggageService) {
        this.ticketService = ticketService;
        this.couponService = couponService;
        this.baggageService = baggageService;
    }

    @GetMapping("/tickets/{id}")
    public ResponseEntity<String> findTicketById(@PathVariable(value = "id") int id) {
        Ticket ticket = ticketService.cache(id);
        return ResponseEntity.ok(String.valueOf(ticket.isEnabled()));
    }

    @PostMapping ("/coupon")
    public ResponseEntity<Double> getDiscount(@RequestBody CouponDTO couponDTO) {
        double newPrice = couponService.getNewPrice(couponDTO);
        return ResponseEntity.ok(newPrice);
    }

    @PostMapping("/baggage")
    public ResponseEntity<Boolean> checkIn(@RequestBody CheckinDTO checkinDTO) {
        int checkIn = baggageService.demo(checkinDTO);
        boolean val = checkIn != 0;
        return ResponseEntity.ok(val);
    }
}
