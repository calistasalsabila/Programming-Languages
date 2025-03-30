// INTERFACE Shape
interface Shape {
    double area();
}

// CLASS Circle
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// CLASS Rectangle
class Rectangle implements Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// CLASS Triangle (Segitiga) -> Tambah bentuk baru TANPA ubah kode lama!
class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// MAIN CLASS
public class d {
    public static void main(String[] args) {
        Shape myCircle = new Circle(7);
        Shape myRectangle = new Rectangle(5, 10);
        Shape myTriangle = new Triangle(4, 6); // Bentuk baru

        System.out.println("Circle Area: " + myCircle.area());
        System.out.println("Rectangle Area: " + myRectangle.area());
        System.out.println("Triangle Area: " + myTriangle.area()); // Bentuk baru tetap bisa dipakai!
    }
}
