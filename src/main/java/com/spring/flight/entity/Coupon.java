package com.spring.flight.entity;

import lombok.Getter;

import java.util.Random;

@Getter
public class Coupon {

    private static final int[] DISCOUNTS = {10,50,60};
    private static final Random RANDOM = new Random();

    private int id;
    private double discount;
    private double price;


    public Coupon(int id, double price) {
        this.id = id;
        this.discount = DISCOUNTS[RANDOM.nextInt(DISCOUNTS.length)];
        this.price = price;
    }
}
