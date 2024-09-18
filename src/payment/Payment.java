package payment;

import model.Booking;

// 10. Payment Class
public class Payment {
    private int id;
    private Booking booking;
    private double amount;
    private PaymentProcessor processor;

    public Payment(Booking booking, double amount, PaymentProcessor processor) {
        this.booking = booking;
        this.amount = amount;
        this.processor = processor;
    }

    public void processPayment() {
        processor.process(amount);
        System.out.println("Payment for booking " + booking.getBookingDetails() + " processed.");
    }
}
