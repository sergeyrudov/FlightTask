package com.spring.flight.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CheckIn {

    private int id;
    private int destinationId;
    private int baggageId;

}
