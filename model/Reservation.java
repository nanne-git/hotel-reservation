package model;

import java.util.Date;

public class Reservation {
    private final Customer customer;
    private final IRoom room;
    private final Date checkInDate;
    private final Date checkOutDate;

    public Reservation(Customer customer,IRoom room,Date checkInDate,Date checkOutDate) {
        this.customer=customer;
        this.room=room;
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate(){
        return checkOutDate;
    }

    public IRoom getRoom(){
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toString(){
        return "customer details :\n"+customer.toString()+"\nroom details :\n"+room.toString()+"\ncheck in date:\n"+checkInDate.toString()+"\ncheck out date:\n"+checkOutDate.toString();
    }
}
