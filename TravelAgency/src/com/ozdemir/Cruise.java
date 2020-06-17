package com.ozdemir;

import java.time.LocalDateTime;

public class Cruise extends Voyage {

    public final static double CRUISE_PRICE_EXTRA_COST = 10;
    private boolean vip;

    public Cruise() {
    }

    public Cruise(int totalPersons, LocalDateTime departureDate, LocalDateTime returnDate, Destination destination, boolean vip) {
        super(totalPersons, departureDate, returnDate, destination);
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public double calculatePrice() {
        double standardPrice = super.calculatePrice();
        double cruisePrice = isVip() ? (super.getTotalPersons() * (CRUISE_PRICE_EXTRA_COST * 1.5)) : (super.getTotalPersons() * CRUISE_PRICE_EXTRA_COST);
        double totalPrice = standardPrice + cruisePrice;
        return totalPrice;
    }
}
