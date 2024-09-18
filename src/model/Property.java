package model;

// 2. model.Property Abstract Class
public abstract class Property {
    private int id;
    private String name;
    private String location;

    public Property(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public abstract String getDetails();
}