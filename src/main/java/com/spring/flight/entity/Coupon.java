package com.spring.flight.entity;

import java.util.Random;

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

    public int getId() {
        return id;
    }

    public double getDiscount() {
        return discount;
    }
}
