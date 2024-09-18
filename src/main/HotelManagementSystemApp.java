package main;

import decorator.*;
import model.*;
import payment.*;
import service.HotelManagementSystem;

import java.util.Date;

public class HotelManagementSystemApp {
    public static void main(String[] args) {
        // Initialize system
        HotelManagementSystem system = new HotelManagementSystem();

        // Add properties
        Property room1 = new Room(1, "Room A", "NYC", 101, "Deluxe", 150.0);
        Property apartment1 = new Apartment(2, "Apartment B", "LA", 202, 3);

        system.addProperty(room1);
        system.addProperty(apartment1);

        // Customer making a booking
        Customer customer = new Customer(1, "John Doe", "john@example.com");
        Booking booking = system.makeBooking(customer, room1, new Date(), new Date());

        // Process payment with seasonal discount
        PaymentProcessor processor = new CreditCardProcessor();
        PaymentProcessor discountProcessor = new SeasonalDiscount(processor);
        Payment payment = new Payment(booking, 150.0, discountProcessor);
        payment.processPayment();
    }
}