package edu.tomer.ness;


public class SportsCar extends Car {
    boolean hasSunRoof;
    int numCylinders;

    public SportsCar() {
        hasSunRoof = IO.getBoolean("Sun Roof?");
        numCylinders = IO.getInt("Enter Num of cylinders:");
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "hasSunRoof=" + hasSunRoof +
                ", numCylinders=" + numCylinders +
                super.toString() + "} " ;
    }
}
