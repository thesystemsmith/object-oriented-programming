// abstraction
public abstract class Vehicle {
    public abstract void move();
}

 class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}