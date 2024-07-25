// polymorphism
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape myShape = new Circle(); // Polymorphic reference
        myShape.draw(); // Outputs "Drawing a circle"
    }
}
