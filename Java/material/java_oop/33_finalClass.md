# 📘 `final class` in Java

## 📌 Definition

In Java, a `final class` is a class that **cannot be extended or inherited**. This means no other class can be a subclass of a final class.

---

## 🎯 Purpose

* 🔒 To **prevent inheritance** for security or design reasons.
* ✅ To create **immutable classes**, like `String`, by restricting modification via inheritance.
* 📦 Often used in **utility or helper classes** to avoid unintended behavior from subclassing.

---

## 🧠 Syntax

```java
final class ClassName {
    // class body
}
```

> Once a class is declared `final`, no subclass can be created from it.

---

## 👀 Example

```java
final class Dokja {
    void greet() {
        System.out.println("Hello from Dokja!");
    }
}

class Jeha extends Dokja { // ❌ Error!
    void reply() {
        System.out.println("Hi!");
    }
}
```

### ❗ Output / Compilation

```
Error: cannot inherit from final 'Dokja'
```

---

## ✅ Valid Use Case Example

```java
final class Hamin {
    void info() {
        System.out.println("This class is final and secure.");
    }
}

public class Main {
    public static void main(String[] args) {
        Hamin h = new Hamin();
        h.info();
    }
}
```

### ✅ Output:

```
This class is final and secure.
```

---

## ⚠️ Notes

* `final class` != `final variable`
* Even if a class is `final`, **its methods can still be overridden within the class**, but not through inheritance.
* Common final classes in Java: `java.lang.String`, `java.lang.Math`, `java.lang.System`

---

## 🧩 Summary

| Feature           | Description                             |
| ----------------- | --------------------------------------- |
| Can be inherited? | ❌ No                                    |
| Typical usage     | Security, immutability, utility classes |
| Java Examples     | `String`, `Math`, `System`              |

---

## 📝 Tips

* Use `final` when you want to create a class that's "complete" and shouldn't be altered via inheritance.
* Combine with `final` methods and variables for strong encapsulation.

---

Happy coding! 💻✨
