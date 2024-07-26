package classesAndObjects;

public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car();
        
        // Assigning values to fields
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2021;

        // Calling method
        myCar.displayInfo();
    }
}

