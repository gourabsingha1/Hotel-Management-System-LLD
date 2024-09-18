## Explanation:

### HotelManagementSystem:
- The main entry point where customers can search properties, make bookings, and process payments.
- Has-a relationship with Property and Booking.

### Property (abstract class):
- Parent class for different types of properties (Room, Apartment).
- Contains common attributes like id, name, location, and the method getDetails().

### Room and Apartment:
- These are concrete subclasses of Property.
- Is-a relationship with Property.

### Customer:
- Represents a customer who can search properties and make bookings.

### Booking:
- Has-a relationship with Customer and Property.
- Manages reservation details (check-in, check-out).

### Payment:
- Has-a relationship with Booking and PaymentProcessor.
- Responsible for processing payments via the processPayment() method.

### PaymentProcessor (interface):
- Implemented by CreditCardProcessor and PaypalProcessor using the Strategy Pattern.

### Discount (abstract class using Decorator Pattern):
- Decorates the PaymentProcessor to apply different discounts like SeasonalDiscount and ReferralDiscount.


## How it works:
- The system allows customers to book rooms or apartments, make bookings, and process payments.
- Discounts are applied using decorators, and payments are processed using different strategies.