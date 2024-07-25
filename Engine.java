// Coupling
public class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startCar() {
        engine.start(); // Low coupling - Car class doesn't need to know the details of how engine starts
    }
}
