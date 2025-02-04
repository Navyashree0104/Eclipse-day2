package wiproday2;

public class Main {
    public static void main(String[] args) {
        vehicle myCar = new Car();
        myCar.start();  // Calls overridden method
        myCar.stop();   // Calls concrete method
    }
}
