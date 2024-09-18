package service;

import model.Booking;
import model.Customer;
import model.Property;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 1. Main Class - Hotel Management System
public class HotelManagementSystem {
    private List<Property> properties = new ArrayList<>();

    public void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> listProperties() {
        return properties;
    }

    public Booking makeBooking(Customer customer, Property property, Date checkIn, Date checkOut) {
        Booking booking = new Booking(customer, property, checkIn, checkOut);
        System.out.println("model.Booking made successfully.");
        return booking;
    }
}