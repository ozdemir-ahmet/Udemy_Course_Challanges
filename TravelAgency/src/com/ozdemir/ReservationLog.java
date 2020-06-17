package com.ozdemir;

import java.util.Arrays;

public class ReservationLog {

    /*
     * Each time the addReservationToList method is called,
     * increase the length of successful Reservations or
     * failedReservations by 1 space and add a voyageReservation.
     * So if the number of days of the trip is not 0 and the number of persons is not 0,
     * add the voyageReservation to the successfulReservations,
     * and those that do not meet the conditions of failedReservations.
     * */

    private VoyageReservation[] successfulBookings;
    private VoyageReservation[] failedBookings;

    public ReservationLog() {
        this.successfulBookings = new VoyageReservation[1];
        this.failedBookings = new VoyageReservation[1];
    }

    public void addReservationToList(VoyageReservation voyageReservation) {
        /*
         * So if the number of days of the trip is not 0 and the number of persons is not 0,
         * add the voyageReservation to the successfulReservations,
         * and those that do not meet the conditions of failedReservations.
         * */
        if (voyageReservation.getVoyage().getTotalDays() > 0 && voyageReservation.getVoyage().getTotalPersons() > 0) {
            if (this.successfulBookings[0] == null){
                this.successfulBookings [0] = voyageReservation;
            } else {
                this.successfulBookings = Arrays.copyOf(this.successfulBookings,this.successfulBookings.length + 1);
                this.successfulBookings [this.successfulBookings.length-1] = voyageReservation;
            }
        } else {
            if (this.failedBookings[0]==null) {
                this.failedBookings[0] = voyageReservation;
            } else {
                this.failedBookings = Arrays.copyOf(this.failedBookings, this.failedBookings.length + 1);
                this.failedBookings[this.failedBookings.length - 1] = voyageReservation;
            }
        }
    }

    public void printSuccessfulReservations() {
        for (VoyageReservation successfulBooking : this.successfulBookings) {
            if (successfulBooking != null)
                System.out.println(successfulBooking);
        }
    }

    public void printFailedReservations() {
        for (VoyageReservation failedBooking : this.failedBookings) {
            if (failedBooking != null)
                System.out.println(failedBooking);
        }
    }
}