package edu.tomer.ness;

/**
 * Created by Dev on 31/03/2016.
 */
public class PrivateCar extends Car{
    boolean hasMagnesium;

    @Override
    public String toString() {
        return "PrivateCar{" +
                "hasMagnesium=" + hasMagnesium +
               super.toString() + "} ";
    }

    public PrivateCar() {
        hasMagnesium = IO.getBoolean("Magnesium?");
    }
}
