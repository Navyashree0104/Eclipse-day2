package wiproday2;

interface Bird {
    void makeSound();  // Abstract method
}

class Dove implements Bird {
    @Override
    public void makeSound() {
        System.out.println("Dove make coo");
    }
}

public class Parrot {
    public static void main(String[] args) {
        Bird myParrot = new Dove();
        myParrot.makeSound();
    }
}

