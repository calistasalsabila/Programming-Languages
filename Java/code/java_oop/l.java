interface Car {
    void drive();

    int speed();
}

interface Engine extends Car {
    void start();
}

interface Maintenance {
    void oilChange();
}

class Lykan implements Engine, Maintenance {
    public void drive() {
        System.out.println("Lykan is driving");
    }

    public int speed() {
        return 100;
    }

    public void start() {
        System.out.println("Lykan started");
    }

    public void oilChange() {
        System.out.println("Lykan oil changed");
    }

}

public class l {
    public static void main(String[] args) {
        Lykan lykan = new Lykan();
        lykan.drive();
        System.out.println(lykan.speed());
        lykan.start();
        lykan.oilChange();
    }
}