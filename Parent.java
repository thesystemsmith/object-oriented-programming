//Dynamic Binding
public class Parent {
    public void showMessage() {
        System.out.println("Message from Parent");
    }
}

class Child extends Parent {
    @Override
    public void showMessage() {
        System.out.println("Message from Child");
    }
}

class Main {
    public static void main(String[] args) {
        Parent myObject = new Child(); // Dynamic binding
        myObject.showMessage(); // Outputs "Message from Child"
    }
}