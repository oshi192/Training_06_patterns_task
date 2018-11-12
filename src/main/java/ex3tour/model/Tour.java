package ex3tour.model;

import ex3tour.model.enums.Flight;
import ex3tour.model.enums.HotelBooking;
import ex3tour.model.enums.Transfer;

public class Tour {
    private Flight flight;
    private HotelBooking hotelBooking;
    private Transfer transfer;
    private boolean insurance;

    private Tour(Builder builder){
        this.flight = builder.flight;
        this.hotelBooking = builder.hotelBooking;
        this.transfer = builder.transfer;
        this.insurance = builder.insurance;
    }
    public static  class Builder{
        private Flight flight;
        private HotelBooking hotelBooking;
        private Transfer transfer;
        private boolean insurance;

        public Builder(){

        }

        public Builder flight(Flight flight){
            this.flight = flight;
            return this;
        }
        public Builder hotelBooking(HotelBooking hotelBooking){
            this.hotelBooking = hotelBooking;
            return this;
        }
        public Builder transfer(Transfer transfer){
            this.transfer = transfer;
            return this;
        }
        public Builder insurance(boolean insurance){
            this.insurance = insurance;
            return this;
        }
        public Tour build(){
            return new Tour(this);
        }
    }

    @Override
    public String toString() {
        return "Tour{" +
                "flight=" + flight +
                ", hotelBooking=" + hotelBooking +
                ", transfer=" + transfer +
                ", insurance=" + insurance +
                '}';
    }
}
