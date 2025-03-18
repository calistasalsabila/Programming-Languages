# 📝 Method Overriding in Java

## 🔍 What is Method Overriding?

**Method Overriding** in Java is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its parent class. The overridden method in the child class must have the **same name, return type, and parameters** as the method in the parent class.

This concept follows the **"Runtime Polymorphism"** principle in Object-Oriented Programming (OOP).

---

## 🎯 Purpose of Method Overriding

✅ To achieve **Runtime Polymorphism** in Java.\
✅ To provide a **specific implementation** of a method that is already defined in a superclass.\
✅ To improve **code reusability** by modifying only necessary parts of the inherited behavior.\
✅ To ensure that the child class **extends** and **modifies** behavior instead of replacing it completely.

---

## 📌 Syntax of Method Overriding

The method in the child class must have:

- The **same method name** as the method in the parent class.
- The **same return type** or a subclass of the return type (Covariant Return Type).
- The **same parameter list**.
- The **@Override annotation** (optional but recommended).

```java
class Parent {
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("Message from Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.showMessage(); // Calls the overridden method in Child class
    }
}
```

---

## 🎯 Rules for Method Overriding

🔹 The method **must have the same name** and **same parameters** as the parent class.\
🔹 The method **cannot have a lower access modifier** (e.g., if it is `public` in the parent class, it cannot be `private` in the child class).\
🔹 The method **cannot be overridden if it is declared as ****`final`**** or ****`static`** in the parent class.\
🔹 The return type must be the same or a subclass (Covariant Return Type).\
🔹 The method in the child class should have the **same or broader access level** (e.g., `protected` can be overridden as `public`).

---

## 🛠 Example of Method Overriding with Input & Output

```java
class Animal {
    void makeSound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Calls the overridden method in Dog class
    }
}
```

### ✅ **Expected Output:**

```
Dog barks
```

---

## 🔥 Super Keyword in Method Overriding

The `super` keyword is used to call the **parent class method** from the child class.

### 🛠 Example using `super`:

```java
class Parent {
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display(); // Calls the parent class method
        System.out.println("This is Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
```

### ✅ **Expected Output:**

```
This is Parent class
This is Child class
```

---

## ⚡ Key Differences: Method Overriding vs Method Overloading

| Feature         | Method Overriding                              | Method Overloading                                                             |
| --------------- | ---------------------------------------------- | ------------------------------------------------------------------------------ |
| Definition      | Redefining a method in the child class         | Multiple methods with the same name but different parameters in the same class |
| Class Involved  | Requires **Inheritance**                       | Can be in the **same class**                                                   |
| Parameters      | Must be **the same**                           | Must be **different**                                                          |
| Return Type     | Same or a **subclass (Covariant Return Type)** | Can be the same or different                                                   |
| Access Modifier | Cannot be more restrictive than parent method  | No restriction                                                                 |

---

## 🚀 Conclusion

Method Overriding is a powerful feature in Java that allows a subclass to modify the behavior of its parent class. It supports **runtime polymorphism** and makes Java more flexible and reusable. Understanding its rules and best practices is crucial for mastering **Object-Oriented Programming (OOP) in Java**. 💡✨

