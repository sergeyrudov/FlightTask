package com.spring.flight.dto;

public class CouponDTO {

    private int id;
    private double price;

    public CouponDTO() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
