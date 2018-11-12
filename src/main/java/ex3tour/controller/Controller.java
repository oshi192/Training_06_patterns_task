package ex3tour.controller;

import ex3tour.model.Tour;
import ex3tour.model.enums.Flight;
import ex3tour.model.enums.HotelBooking;
import ex3tour.model.enums.Transfer;
import util.Reader;

public class Controller {
    Flight chooseFlight() {
        System.out.println("Chhose your flight");
        for (int i = 0; i < Flight.values().length; i++) {
            System.out.println(i + 1 + ": " + Flight.values()[i].name());
        }
        return Flight.values()[Reader.getNumber("answer: ", 1, Flight.values().length) - 1];
    }

    public void run() {
        Tour tour = new Tour.Builder()
                .flight(chooseFlight())
                .transfer(chooseTransfer())
                .hotelBooking(chooseBooking())
                .insurance(chooseInsurance())
                .build();
        System.out.println("your tour: \n" + tour);
    }

    private boolean chooseInsurance() {
        System.out.println("need insurance? 1-yes,2-no");
        return Reader.getNumber("answer: ", 1, 2) == 1;
    }

    private HotelBooking chooseBooking() {
        System.out.println("Chhose Your HotelBooking");
        for (int i = 0; i < HotelBooking.values().length; i++) {
            System.out.println(i + 1 + ": " + HotelBooking.values()[i].name());
        }
        return HotelBooking.values()[Reader.getNumber("answer: ", 1, HotelBooking.values().length) - 1];
    }

    private Transfer chooseTransfer() {
        System.out.println("Chhose Your transfer");
        for (int i = 0; i < Transfer.values().length; i++) {
            System.out.println(i + 1 + ": " + Transfer.values()[i].name());
        }
        return Transfer.values()[Reader.getNumber("answer: ", 1, Transfer.values().length) - 1];
    }
}
