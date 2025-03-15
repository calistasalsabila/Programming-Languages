# 🚀 Java Constructor

## 🔹 What is a Constructor?
A **constructor** in Java is a special method used to initialize objects. It is called when an instance of a class is created. Constructors have the same name as the class and do not have a return type (not even `void`).

---
## 🔹 Syntax of Constructor
```java
class ClassName {
    // Constructor
    ClassName() {
        // Initialization code
    }
}
```

---
## 🔹 Types of Constructors
### 1️⃣ **Default Constructor** 🏗️
A constructor that does not take any parameters and initializes the object with default values.

```java
class Car {
    String brand;

    // Default Constructor
    Car() {
        brand = "Toyota";
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display(); // Output: Brand: Toyota
    }
}
```

---
### 2️⃣ **Parameterized Constructor** 🎯
A constructor that takes arguments to initialize object properties with user-defined values.

```java
class Car {
    String brand;

    // Parameterized Constructor
    Car(String carBrand) {
        brand = carBrand;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Honda");
        myCar.display(); // Output: Brand: Honda
    }
}
```

---
### 3️⃣ **Constructor Overloading** 🌀
Having multiple constructors with different parameters in the same class.

```java
class Car {
    String brand;
    int year;

    // Default Constructor
    Car() {
        brand = "Toyota";
        year = 2023;
    }

    // Parameterized Constructor
    Car(String carBrand, int carYear) {
        brand = carBrand;
        year = carYear;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Honda", 2022);

        car1.display(); // Output: Brand: Toyota, Year: 2023
        car2.display(); // Output: Brand: Honda, Year: 2022
    }
}
```

---
### 4️⃣ **Copy Constructor** 📋
A constructor that creates a copy of another object.

```java
class Car {
    String brand;

    // Parameterized Constructor
    Car(String carBrand) {
        brand = carBrand;
    }

    // Copy Constructor
    Car(Car c) {
        brand = c.brand;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car(car1); // Copying car1 to car2

        car1.display(); // Output: Brand: BMW
        car2.display(); // Output: Brand: BMW
    }
}
```

---
## 🔹 Key Points 📌
✅ A constructor has the **same name** as the class.  
✅ It **does not have a return type**.  
✅ If no constructor is defined, Java provides a **default constructor**.  
✅ **Constructors can be overloaded** by changing the parameters.  
✅ A **copy constructor** is used to create a duplicate object.  

---
## 🎯 Conclusion
Constructors play a crucial role in **object initialization**. By understanding **default, parameterized, overloaded, and copy constructors**, you can effectively manage object creation in Java! 🚀🔥
