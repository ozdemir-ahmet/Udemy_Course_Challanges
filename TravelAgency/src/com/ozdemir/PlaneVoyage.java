package com.ozdemir;

import java.time.LocalDateTime;

public class PlaneVoyage extends Voyage {

    private double airplaneTicketPrice;

    public PlaneVoyage(double airplaneTicketPrice) {
        this.airplaneTicketPrice = airplaneTicketPrice;
    }

    public PlaneVoyage(int totalPersons, LocalDateTime departureDate, LocalDateTime returnDate, Destination destination, double airplaneTicketPrice) {
        super(totalPersons, departureDate, returnDate, destination);
        this.airplaneTicketPrice = airplaneTicketPrice;
    }

    @Override
    public double calculatePrice() {
        double standardPrice = super.calculatePrice();
        double totalPrice= standardPrice + this.airplaneTicketPrice;
        return totalPrice;
    }
}