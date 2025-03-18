# Java Inheritance

## 1️⃣ What is Inheritance?
Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows one class (child class) to inherit properties and behaviors (methods) from another class (parent class). It enables code reusability and establishes a hierarchy between classes.

### 🔹 Key Points
- **Reusability**: Code from the parent class can be reused in child classes.
- **Hierarchical structure**: Defines relationships between classes.
- **Extensibility**: Child classes can add their own properties and methods.
- **Polymorphism support**: Allows overriding parent methods in child classes.

## 2️⃣ Syntax of Inheritance in Java
To implement inheritance, use the `extends` keyword.

```java
// Parent class (SuperClass)
class ParentClass {
    // Attributes
    String attribute = "I am from ParentClass";

    // Method
    void display() {
        System.out.println("This is a method from ParentClass");
    }
}

// Child class (SubClass) inheriting from ParentClass
class ChildClass extends ParentClass {
    // Additional method
    void childMethod() {
        System.out.println("This is a method from ChildClass");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println(child.attribute); // Accessing inherited attribute
        child.display(); // Calling inherited method
        child.childMethod(); // Calling ChildClass method
    }
}
```

## 3️⃣ Output
```
I am from ParentClass
This is a method from ParentClass
This is a method from ChildClass
```

## 4️⃣ Overriding Methods in Inheritance
A subclass can override methods from the parent class using the `@Override` annotation.

```java
// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class overriding method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Output: Animals make sounds

        Dog myDog = new Dog();
        myDog.sound(); // Output: Bark Bark!
    }
}
```

## 5️⃣ Using `super` Keyword
The `super` keyword is used to refer to the parent class's methods and constructors.

```java
// Parent class
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

// Child class
class Car extends Vehicle {
    Car() {
        super(); // Calls the constructor of the parent class
        System.out.println("Car is created");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
```

### Output
```
Vehicle is created
Car is created
```

## 6️⃣ Types of Inheritance in Java
### 1️⃣ Single Inheritance
A subclass inherits from a single parent class.
```java
class A { }
class B extends A { }
```

### 2️⃣ Multilevel Inheritance
A subclass inherits from another subclass.
```java
class A { }
class B extends A { }
class C extends B { }
```

### 3️⃣ Hierarchical Inheritance
Multiple subclasses inherit from a single parent class.
```java
class A { }
class B extends A { }
class C extends A { }
```

### 🚫 Java **does not support multiple inheritance** (one child class cannot inherit from multiple parent classes).

## 7️⃣ Advantages of Inheritance
✔ Code reusability
✔ Less code duplication
✔ Better maintainability
✔ Improved readability
✔ Establishes relationships between classes

## 8️⃣ When to Use Inheritance?
✅ When multiple classes share common attributes and methods.
✅ When you need a structured hierarchy.
✅ When code reusability is a priority.

---

### ✅ Summary
- `extends` is used to implement inheritance.
- Methods can be overridden using `@Override`.
- `super` is used to call parent methods or constructors.
- Java supports **Single, Multilevel, and Hierarchical Inheritance**, but not Multiple Inheritance.

💡 Inheritance makes Java code **more efficient and maintainable**! 🚀
