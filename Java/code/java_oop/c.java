// SUPERCLASS Shape
class Shape {
    double area() {
        return 0; // Default area = 0 (akan di-override oleh subclass)
    }
}

// SUBCLASS Circle, Rectangle, Triangle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// MAIN CLASS
public class c {
    public static void main(String[] args) {
        Shape myCircle = new Circle(7);
        Shape myRectangle = new Rectangle(5, 10);
        Shape myTriangle = new Triangle(4, 6);

        System.out.println("Circle Area: " + myCircle.area());
        System.out.println("Rectangle Area: " + myRectangle.area());
        System.out.println("Triangle Area: " + myTriangle.area());
    }
}
