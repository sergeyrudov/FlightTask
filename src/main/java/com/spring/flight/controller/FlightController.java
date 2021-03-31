package com.spring.flight.controller;


import com.spring.flight.dto.CouponDTO;
import com.spring.flight.entity.Ticket;
import com.spring.flight.service.CouponService;
import com.spring.flight.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FlightController {

    private final TicketService ticketService;

    private final CouponService couponService;

    public FlightController(TicketService ticketService, CouponService couponService) {
        this.ticketService = ticketService;
        this.couponService = couponService;

    }

    @GetMapping("/tickets/{id}")
    public ResponseEntity<String> findTicketById(@PathVariable(value = "id") int id) {
        Ticket ticket = ticketService.findById(id);

        return ResponseEntity.ok(String.valueOf(ticket.getEnabled()));
    }

    @PostMapping ("/coupon")
    public ResponseEntity<Double> getDiscount(@RequestBody CouponDTO couponDTO) {
        double newPrice = couponService.getNewPrice(couponDTO);
        return ResponseEntity.ok(newPrice);
    }
}
