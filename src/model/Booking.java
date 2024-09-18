package model;

import java.util.Date;

// 6. model.Booking Class
public class Booking {
    private int id;
    private Customer customer;
    private Property property;
    private Date checkInDate;
    private Date checkOutDate;

    public Booking(Customer customer, Property property, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.property = property;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingDetails() {
        return "model.Booking for: " + customer.getName() + ", Property: " + property.getDetails() +
                ", From: " + checkInDate + " to " + checkOutDate;
    }
}
