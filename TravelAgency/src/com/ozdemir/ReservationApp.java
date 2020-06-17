package com.ozdemir;

import java.time.LocalDateTime;

public class ReservationApp {

    public static void main(String[] args) {
	    Address ahmetsAddress = new Address("Celes","51",3000,"Leuven");
	    Address mehmetsAddress = new Address("Delft","32A",4300,"Antwerpen");
        Address travelAgencysAddress = new Address("Fort","34",3500,"Brussels");

	    Person ahmet = new Person("Ahmet","Ozdemir",ahmetsAddress);
        Person mehmet = new Person("Mehmet","Mert",mehmetsAddress);

        TravelAgency travelAgency = new TravelAgency("Travela",travelAgencysAddress);

        CarVoyage carVoyage1 = new CarVoyage(true);
        CarVoyage carVoyage2 = new CarVoyage(12, LocalDateTime.of(2020,3,20,12,0),LocalDateTime.of(2020,4,10,12,0),Destination.GREECE,false);

        PlaneVoyage planeVoyage = new PlaneVoyage(1, LocalDateTime.of(2020, 4, 5, 12, 0), LocalDateTime.of(2020, 4, 30, 12, 0),Destination.TURKEY,250);

        VoyageReservation reservation1 = new VoyageReservation(ahmet, carVoyage2, travelAgency);
        VoyageReservation reservation2 = new VoyageReservation(mehmet, carVoyage1, travelAgency);
        VoyageReservation reservation3 = new VoyageReservation(mehmet, planeVoyage, travelAgency);

        ReservationLog log = new ReservationLog();
        log.addReservationToList(reservation1);
        log.addReservationToList(reservation2);
        log.addReservationToList(reservation3);

        log.printSuccessfulReservations();
        log.printFailedReservations();
    }
}
