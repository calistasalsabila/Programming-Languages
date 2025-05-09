class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Cat{
        String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getAnimal() {
            return Animal.this.getName(); // pake Animal biar akses nya ke outer class nya
        }
    }
}

public class p {
    public static void main(String[] args) {
        Animal cats = new Animal();
        cats.setName("Daun");

        Animal.Cat meow = cats.new Cat();
        meow.setColor("Ijo");

        cats.getName();
        System.out.println(cats.getName());
    }
}