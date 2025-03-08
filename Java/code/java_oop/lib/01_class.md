# Class in Java

## 1. What is a Class?
A class is a blueprint or template for creating objects. It defines **attributes (variables)** and **behavior (methods)** that the objects will have.

## 2. Simple Class Example
```java
// Creating a class with attributes and methods
class Student {
    // Attributes (fields)
    String name;
    int age;
    
    // Constructor (special method for object initialization)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

## 3. Creating an Object from a Class
```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student1 = new Student("Calista", 19);
        
        // Calling a method on the object
        student1.displayInfo();
    }
}
```
**Output:**
```
Name: Calista
Age: 19
```

## 4. Basic Structure of a Class
A class typically consists of:
- **Attributes** → Variables that store data
- **Constructor** → A special method for initializing objects
- **Methods** → Functions that define the object's behavior

## 5. Access Modifiers in a Class
- `public` → Accessible from anywhere
- `private` → Accessible only within the same class
- `protected` → Accessible within the same package & subclasses
- `default` (no modifier) → Accessible within the same package

## 6. Conclusion
- **A class is a template for objects**
- **Objects are created from a class using the `new` keyword**
- **Methods in a class define the behavior of objects**
- **Use constructors to initialize attributes**

