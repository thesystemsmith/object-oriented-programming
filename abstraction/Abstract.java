package abstraction;

abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Outputs "Bark"
        myDog.eat(); // Outputs "Animal is eating"
    }
}