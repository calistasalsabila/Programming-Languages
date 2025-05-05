interface Animal {

    void speak();
}

class Cat implements Animal {
    private String sound;

    // Constructor untuk set suara langsung
    public Cat(String sound) {
        this.sound = sound;
    }

    public void speak() {
        System.out.println(sound);
    }

    public int getAge() {
        return 5;
    }
}

public class k {
    public static void main(String[] args) {
        Cat c = new Cat("meor");
        System.out.println(c.getAge());
        c.speak();
    }
}

