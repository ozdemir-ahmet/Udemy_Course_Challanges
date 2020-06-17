package com.ozdemir;

import java.time.LocalDateTime;

public class CarVoyage extends Voyage {

    public static final double EXTRA_PRICE_CAR_RENTAL = 10;
    private boolean ownCar;

    public CarVoyage(boolean ownCar) {
        this.ownCar = ownCar;
    }

    public CarVoyage(int totalPersons, LocalDateTime departureDate, LocalDateTime returnDate, Destination destination, boolean ownCar) {
        super(totalPersons, departureDate, returnDate, destination);
        this.ownCar = ownCar;
    }

    public boolean isOwnCar() {
        return this.ownCar;
    }

    public void setOwnCar(boolean ownCar) {
        this.ownCar = ownCar;
    }

    @Override
    public double calculatePrice() {
        double standardPrice = super.calculatePrice();
        double carRentalPrice = EXTRA_PRICE_CAR_RENTAL * super.getTotalDays() * this.calculateNumberOfCars();
        double totalPrice= standardPrice + carRentalPrice;
        return totalPrice;
    }

    public int calculateNumberOfCars() {
        return (this.getTotalPersons() % 5 == 0) ? this.getTotalPersons() / 5 : this.getTotalPersons()/5 + 1;
    }
}