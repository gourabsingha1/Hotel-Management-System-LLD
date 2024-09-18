package model;

// 3. model.Room Class Extending model.Property
public class Room extends Property {
    private int roomNumber;
    private String type;
    private double price;
    private boolean isAvailable;

    public Room(int id, String name, String location, int roomNumber, String type, double price) {
        super(id, name, location);
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = true;
    }

    @Override
    public String getDetails() {
        return "model.Room Number: " + roomNumber + ", Type: " + type + ", Price: $" + price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}