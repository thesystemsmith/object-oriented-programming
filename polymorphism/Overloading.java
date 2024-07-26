package polymorphism;

class DisplayOverload {
    void display(int a) {
        System.out.println("Got Integer data: " + a);
    }

    void display(String b) {
        System.out.println("Got String data: " + b);
    }
}

public class Overloading {
    public static void main(String[] args) {
        DisplayOverload obj = new DisplayOverload();
        obj.display(1); // Outputs "Got Integer data: 1"
        obj.display("Hello"); // Outputs "Got String data: Hello"
    }
}
