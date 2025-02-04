package wiproday2;
//single inheritance
class Rose {
    void red() {
        System.out.println("This flower smells good");
    }
}

class Lily extends Rose {
    void white() {
        System.out.println("Lily is white");
    }
}

public class Flower {
    public static void main(String[] args) {
        Lily myLily = new Lily();
        myLily.red();  
        myLily.white();
    }
}

