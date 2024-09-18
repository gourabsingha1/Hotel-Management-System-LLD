package model;

// 4. model.Apartment Class Extending model.Property
public class Apartment extends Property {
    private int apartmentNumber;
    private int numberOfRooms;

    public Apartment(int id, String name, String location, int apartmentNumber, int numberOfRooms) {
        super(id, name, location);
        this.apartmentNumber = apartmentNumber;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String getDetails() {
        return "model.Apartment Number: " + apartmentNumber + ", Rooms: " + numberOfRooms;
    }
}