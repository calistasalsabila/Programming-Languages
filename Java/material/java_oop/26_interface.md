## 🌟 Interface

### 📘 Definition

An **interface** in Java is a **blueprint of a class** that can only contain *abstract methods* (before Java 8) and *constants*. Interfaces are used to achieve *abstraction* and *multiple inheritance* in Java.

Starting from Java 8, interfaces can also have:

* `default` methods (with implementation)
* `static` methods

> Interface = a contract that must be followed by any class that implements it

---

### 🎯 Purpose of Using Interfaces

* Support **polymorphism** and **abstraction**
* Enable **multiple inheritance** (not supported in regular classes)
* Separate behavior definitions from implementation
* Ideal for **contract-based design** and unit testing

---

### 🧠 Basic Interface Syntax

```java
interface InterfaceName {
    // Constants
    int CONSTANT = 10; 

    // Abstract method (implicitly public & abstract)
    void methodOne();

    // Default method (Java 8+)
    default void methodTwo() {
        System.out.println("Default method");
    }

    // Static method
    static void methodThree() {
        System.out.println("Static method");
    }
}
```

### 🧩 Example: Class Implementing Interface

```java
interface Character {
    void speak();
}

class Dokja implements Character {
    public void speak() {
        System.out.println("Dokja: I’m the last reader.");
    }
}

class Jeha implements Character {
    public void speak() {
        System.out.println("Jeha: I’m a UI developer.");
    }
}

public class Main {
    public static void main(String[] args) {
        Character d = new Dokja();
        Character j = new Jeha();

        d.speak();
        j.speak();
    }
}
```

### 💡 Output

```
Dokja: I’m the last reader.
Jeha: I’m a UI developer.
```

---

### 🔄 Multiple Interfaces

```java
interface A {
    void one();
}

interface B {
    void two();
}

class Hamin implements A, B {
    public void one() {
        System.out.println("Method one");
    }

    public void two() {
        System.out.println("Method two");
    }
}
```

### 🧪 Interface vs Abstract Class

| Feature          | Interface                 | Abstract Class     |
| ---------------- | ------------------------- | ------------------ |
| Keyword          | `interface`               | `abstract class`   |
| Inheritance      | Multiple                  | Single             |
| Method type      | abstract, default, static | abstract, concrete |
| Constructor      | ❌ Not available           | ✅ Available        |
| Field            | Final & static only       | Can be non-final   |
| Implement/Extend | `implements`              | `extends`          |

---

### 🛠️ Important Tips

* Use interfaces when you want to **enforce behaviors** without enforcing structure.
* Always use `@Override` when implementing methods to prevent typos.
* You can use **anonymous classes** for quick implementation.

---

### 🧪 Example: Anonymous Class

```java
Character dazai = new Character() {
    public void speak() {
        System.out.println("Dazai: I’m full of mysteries.");
    }
};

dazai.speak();
```

### 💬 Output

```
Dazai: I’m full of mysteries.
```

---

### ✅ Conclusion

Java interfaces are powerful tools for creating flexible, modular, and testable code. Use them when you need:

* A behavior contract between classes
* Multiple inheritance
* Polymorphism

> Use interfaces wisely to make your system more scalable and maintainable 💡

---

### 📚 Additional References

* [Oracle Java Interface Documentation](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
* Book: *Effective Java* by Joshua Bloch (Items on Interfaces)

---
