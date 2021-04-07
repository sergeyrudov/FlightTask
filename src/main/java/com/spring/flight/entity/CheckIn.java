package com.spring.flight.entity;


public class CheckIn {

    private int id;
    private int destinationId;
    private int baggageId;


    public CheckIn(int id, int destinationId, int baggageId) {
        this.id = id;
        this.destinationId = destinationId;
        this.baggageId = baggageId;
    }

    public int getId() {
        return id;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public int getBaggageId() {
        return baggageId;
    }
}
