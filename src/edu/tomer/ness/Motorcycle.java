package edu.tomer.ness;

public class Motorcycle extends Car {
    int maxSpeed;

    public Motorcycle() {
        maxSpeed = IO.getInt("Max Speed?");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }
}
