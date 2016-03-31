package edu.tomer.ness;

/**
 * Created by Dev on 31/03/2016.
 */
public class SUV extends Car {
    boolean hasTowingHook;

    public SUV() {
        super();
        this.hasTowingHook = IO.getBoolean("Has Towing hook?");
    }

    @Override
    public String toString() {
        return "SUV{" +
                "hasTowingHook=" + hasTowingHook +
                   super.toString() + "} ";
    }
}
