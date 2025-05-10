public class Animal {
    public static final String KINGDOM = "Animalia";

    public static void sound(String name) {
        switch (name.toLowerCase()) {
            case "dog" -> System.out.println("Woof!");
            case "cat" -> System.out.println("Meow!");
            case "cow" -> System.out.println("Moo!");
            default -> System.out.println("Unknown animal sound");
        }
    }

    public static void info() {
        System.out.println("All animals belong to the kingdom: " + KINGDOM);
    }

    // Static Nested Class
    public static class Facts {
        public static void show() {
            System.out.println("Fun Fact: Animals are multicellular and eukaryotic.");
        }
    }

    // Non-static Inner Class
    public class Classification {
        public void showClass() {
            System.out.println("Animals are classified into mammals, reptiles, birds, etc.");
        }
    }

    // Tambahan: Inner Class biasa
    public class Example {
        public void demo() {
            System.out.println("This is an example of a non-static inner class.");
        }
    }
}
