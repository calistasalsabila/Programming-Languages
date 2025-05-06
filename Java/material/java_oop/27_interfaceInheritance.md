## 🔗 Interface Inheritance in Java 

### 📘 Definition

In Java, interfaces can **inherit from other interfaces** using the `extends` keyword. This allows you to create a **hierarchy of interfaces**, where one interface can inherit the abstract methods (and default/static methods) of another.

> Note: A class uses `implements`, but **interface-to-interface** uses `extends`.

---

### 🧠 Syntax: Interface Inheriting Interface

```java
interface BaseInterface {
    void baseMethod();
}

interface DerivedInterface extends BaseInterface {
    void derivedMethod();
}

class Dokja implements DerivedInterface {
    public void baseMethod() {
        System.out.println("Base method from interface");
    }

    public void derivedMethod() {
        System.out.println("Derived method from interface");
    }
}

public class Main {
    public static void main(String[] args) {
        DerivedInterface dokja = new Dokja();
        dokja.baseMethod();
        dokja.derivedMethod();
    }
}
```

### 💡 Output

```
Base method from interface
Derived method from interface
```

---

### 🔁 Multiple Inheritance in Interfaces

Interfaces in Java can **extend multiple interfaces** at once. This is useful when you want to combine behaviors.

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Amphibious extends Flyable, Swimmable {
    void transform();
}

class Jeha implements Amphibious {
    public void fly() {
        System.out.println("Flying");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void transform() {
        System.out.println("Transforming!");
    }
}
```

### 💬 Output

```
Flying
Swimming
Transforming!
```

---

### 🧩 Use Case Example: Modular Abstraction

```java
interface Engine {
    void start();
}

interface Electric extends Engine {
    void charge();
}

interface Autonomous extends Electric {
    void autoPilot();
}

class Hamin implements Autonomous {
    public void start() {
        System.out.println("Engine started");
    }
    public void charge() {
        System.out.println("Charging...");
    }
    public void autoPilot() {
        System.out.println("Autopilot engaged");
    }
}
```

### 📦 Output

```
Engine started
Charging...
Autopilot engaged
```

---

### 🛠️ Key Notes

* Interface inheritance helps in designing scalable architecture
* You can use **multi-level inheritance** (an interface extends an interface which extends another...)
* **Default methods** are also inherited unless overridden
* No diamond problem occurs because implementation is always in the class

---

### ✅ Conclusion

Java interface inheritance is a powerful way to create layered and modular behavior. It's especially useful when building systems where abstraction and separation of concerns are priorities.

> Prefer interface inheritance for flexible design — it's lightweight, clean, and powerful 🧠

---


### 📚 References

* [Java Interface Inheritance - Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/interfaceDef.html)
* *Effective Java* by Joshua Bloch

---
