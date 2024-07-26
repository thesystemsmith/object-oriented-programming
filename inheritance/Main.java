package inheritance;

// Superclass
class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Subclass
class Car extends Vehicle {
    public void display() {
        System.out.println("Car is a type of Vehicle");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();  // Inherited method
        myCar.display(); // Subclass method
    }
}

// basic inheritance