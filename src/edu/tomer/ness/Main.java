package edu.tomer.ness;


import java.util.ArrayList;

public class Main {
    static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        while (true){
            int choice = IO.getInt("Pick a number: \n" +
                                    "1: add Car\n" +
                                    "2: display all cars\n" +
                                    "3: search car By Id\n" +
                                    "any other key:quit\n");
            if (choice == 1)
                addCar();
            else if (choice == 2)
                dispAllCars();
            else if (choice == 3)
                searchById();
            else break;
        }
    }

    static void searchById() {
        String id = IO.getString("Enter id to search:");
        for (Car car : cars) {
            if (car.id.equals(id)) {
                System.out.println(car);
                return;
            }
        }
        System.out.println("No such car");
    }

    static void dispAllCars() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    static void addCar() {
        int choice = IO.getInt("Pick a number: \n" +
                "1: add SUV Car\n" +
                "2: add Sports Car\n" +
                "3: add Motorcycle Car\n" +
                "4: add Private Car\n");
        Car c;

        if (choice == 1)
            c = new SUV();
        else if (choice == 2)
            c = new SportsCar();
        else  if (choice == 3)
            c = new Motorcycle();
        else if (choice == 4)
            c = new Car();
        else {
            System.out.println("Did not enter 1 - 4 try again.");
            addCar();
            return;
        };

        cars.add(c);
    }
}
