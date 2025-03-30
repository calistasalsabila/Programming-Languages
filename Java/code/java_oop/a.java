// CLASS INDUK
class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

// INTERFACE Pet
interface Pet {
    void play();
}

// CLASS Dog extends Animal dan implements Pet
class Dog extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("Dog is playing...");
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breathe(); // Dari Animal (extends)
        myDog.play(); // Dari Pet (implements)
    }
}
