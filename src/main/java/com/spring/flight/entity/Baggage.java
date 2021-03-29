package com.spring.flight.entity;

import javax.persistence.*;


@Entity
@Table(name = "baggage")
public class Baggage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "destinationId")
    private int destinationId;

    @Column(name = "baggageId")
    private int baggageId;

    public Baggage() {
    }

    public Baggage(int destinationId, int baggageId) {
        this.destinationId = destinationId;
        this.baggageId = baggageId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(int baggageId) {
        this.baggageId = baggageId;
    }
}

