# 🧠 Abstract Method in Java

## 📝 Definition
An **abstract method** in Java is a method that is declared **without an implementation**. That means it only has the method signature, and **no body** (no curly braces `{}` with code inside).

```java
abstract void myMethod();
```

Such methods are meant to be **overridden** in subclasses, and they **must be defined inside an abstract class**.

---

## 🎯 Purpose
Abstract methods allow us to define a method that **must be implemented** by any subclass. This is useful when you want to create a **template or blueprint** that enforces subclasses to provide specific functionality.

---

## 🏗️ Syntax Structure
```java
abstract class ClassName {
    abstract returnType methodName(parameters);
}
```

🔸 You cannot create an object from an abstract class.
🔸 If a class has at least one abstract method, it must be declared abstract.
🔸 A subclass must override all abstract methods unless it is also abstract.

---

## 👩‍💻 Example
### Abstract Class and Abstract Method
```java
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void makeSound();

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Implementing abstract method
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dokja");
        myDog.makeSound();  // Output: Dokja says Woof!
        myDog.eat();        // Output: Dokja is eating.
    }
}
```

---

## 🔒 Rules & Restrictions
- ❌ Cannot instantiate abstract classes.
- ✅ Can have constructors, fields, and concrete methods.
- ✅ Subclass **must** override abstract methods.
- ❌ Abstract methods **cannot** be private, static, or final.

---

## 📌 Use Cases
- Designing a base class for subclasses to follow a specific method structure.
- Enforcing a contract for subclasses.
- Helpful in large-scale applications with polymorphism and inheritance.

---

## 🧩 Real-World Analogy
Imagine an **abstract class** `Vehicle` with an **abstract method** `move()`. A `Car` moves differently than a `Bicycle`, but every vehicle **must** implement how it moves. `move()` is just a rule in the abstract class, and each vehicle defines it in its own way.

---

## ✅ Summary
| Feature                | Abstract Method        |
|------------------------|-------------------------|
| Implementation         | ❌ Not provided         |
| Must be overridden     | ✅ Yes                  |
| Belongs to class type  | 🧱 Abstract class only  |
| Access Modifiers       | 🚫 Not private/static/final |
| Object Creation        | ❌ Cannot instantiate abstract class |

Abstract methods are like **incomplete instructions** that **force subclasses to fill in the blanks**. Use them when you want subclasses to follow a strict design contract. 💡

---

Happy Coding! 💻✨

