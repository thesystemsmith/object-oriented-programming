package inheritance;

class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        super.eat(); // Calls the eat method of Animal
        System.out.println("Dog eats dog food");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Outputs both "Animal eats" and "Dog eats dog food"
    }
}