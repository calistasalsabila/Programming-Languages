import static Animal.*;

public class mixAnimal {
    public static void main(String[] args) {
        info();
        System.out.println("Kingdom: " + KINGDOM);
        sound("cow");

        // Static Nested Class
        Facts.show();

        // Non-static inner class
        Animal animal = new Animal();
        Animal.Classification classification = animal.new Classification();
        classification.showClass();

        // Tambahan inner class
        Animal.Example example = animal.new Example();
        example.demo();
    }
}



// Tanpa import static
// Animal.info();
// Animal.sound("cow");
// Animal.Facts.show();
