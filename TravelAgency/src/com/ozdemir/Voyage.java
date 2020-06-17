package com.ozdemir;

import java.time.Instant;
import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Voyage {
    public static final double PRICE_PER_DAY = 40.0;
    private long totalDays;
    private int totalPersons;
    private LocalDateTime departureDate ;
    private LocalDateTime returnDate;
    private Destination destination;

    public Voyage() {
    }

    public Voyage(int totalPersons, LocalDateTime departureDate, LocalDateTime returnDate, Destination destination) {
        this.totalPersons = totalPersons;
        this.destination = destination;

        if (departureDate.isAfter(LocalDateTime.now()) && returnDate.isAfter(LocalDateTime.now())) {
            if (departureDate.isBefore(returnDate)) {
                this.departureDate = departureDate;
                this.returnDate = returnDate;
                this.totalDays = DAYS.between(departureDate,returnDate);
            }else {
                System.out.println("Departure date can not be later than return date");
            }
        } else{
            System.out.println("Departure or return date can not be earlier than now");
        }
    }

    public static double getPRICE() {
        return PRICE_PER_DAY;
    }

    public long getTotalDays() {
        return totalDays;
    }

    public int getTotalPersons() {
        return totalPersons;
    }

    public void setTotalPersons(int totalPersons) {
        this.totalPersons = totalPersons;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        if (departureDate.isAfter(LocalDateTime.now())) {
            if (departureDate.isBefore(this.returnDate)) {
                this.departureDate = departureDate;
            }else {
                System.out.println("Departure date can not be later than return date");
            }
        } else{
            System.out.println("Departure Date can not be earlier than now");
        }
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        if (returnDate.isAfter(LocalDateTime.now())){
            if (returnDate.isAfter(this.departureDate)){
                this.returnDate = returnDate;
            } else {
                System.out.println("Return date can not be earlier than departure date");
            }
        }else {
            System.out.println("Return Date can not be earlier than now");
        }
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public double calculatePrice() {
        return PRICE_PER_DAY * this.getTotalDays();
    }

    @Override
    public String toString() {
        return "    Voyage{\n" +
                "           totalDays:" + getTotalDays() + "," + "\n" +
                "           totalPersons:" + totalPersons + "," + "\n" +
                "           departureDate:" + getDepartureDate() + "," + "\n" +
                "           returnDate:" + getReturnDate() + "," + "\n" +
                "           destination:" + destination + "\n" +
                "    }";
    }
}
