package com.spring.flight.dto;

public class CheckinDTO {

    private int id;
    private int destinationId;
    private int baggageId;


    public CheckinDTO() {
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
