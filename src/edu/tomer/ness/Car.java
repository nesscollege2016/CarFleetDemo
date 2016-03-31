package edu.tomer.ness;

/**
 * Created by Dev on 31/03/2016.
 */
public class Car {

    public Car(String id, String model, int year,
               String color, String category) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
        this.category = category;
    }


    public Car() {
        this.id = IO.getString("Enter id");
        this.model = IO.getString("Enter Model");
        this.year = IO.getInt("Enter Year");
        this.color = IO.getString("Enter Color");
        this.category = IO.getString("Enter Category");
    }

    String id;
    String model;
    int year;
    String color;
    String category;

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", category='" + category + '\'';

    }
}
