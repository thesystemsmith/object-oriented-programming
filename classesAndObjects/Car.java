package classesAndObjects;

public class Car {
    // Fields
    String make;
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Method
    void displayInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

