## 🧭 Using `super` in Java: Class vs Interface

In Java, the `super` keyword is commonly used to refer to the **parent class or interface**. But its **usage varies** depending on whether you're working with classes or interfaces.

This doc breaks down how `super` works in both contexts: 📦

---

### 🧱 1. `super` in Classes

#### ✅ Purpose:

* To call **parent class methods**
* To access **parent class constructor** (via `super()`)

#### 📌 Example 1: Call parent constructor

```java
class Jeha {
    Jeha() {
        System.out.println("Jeha constructor");
    }
}

class Dokja extends Jeha {
    Dokja() {
        super(); // calls Jeha's constructor
        System.out.println("Dokja constructor");
    }
}

// Output:
// Jeha constructor
// Dokja constructor
```

#### 📌 Example 2: Access overridden method

```java
class Jeha {
    void greet() {
        System.out.println("Hi from Jeha");
    }
}

class Dokja extends Jeha {
    void greet() {
        super.greet(); // calls Jeha's greet()
        System.out.println("Hi from Dokja");
    }
}
```

---

### 🧩 2. `super` in Interfaces (Java 8+)

> You **cannot** use `super()` in interfaces because **interfaces do not have constructors**. ❌

But you **can** call a default method from a specific interface like this:

```java
InterfaceName.super.methodName();
```

#### ✅ Purpose:

* To resolve **default method conflicts** when multiple interfaces define the same method

#### 📌 Example:

```java
interface A {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from B");
    }
}

class Hamin implements A, B {
    public void greet() {
        A.super.greet(); // pick which one to call
    }
}

// Output:
// Hello from A
```

---

### 📊 Comparison Summary

| Usage                           | Class              | Interface                        |
| ------------------------------- | ------------------ | -------------------------------- |
| Call parent constructor         | ✅ `super()`        | ❌ Not allowed                    |
| Access parent method            | ✅ `super.method()` | ✅ `InterfaceName.super.method()` |
| Can override method             | ✅ Yes              | ✅ Yes                            |
| Used to resolve method conflict | ✅ Sometimes        | ✅ Yes (default method conflict)  |

---

### 🧠 Mnemonic:

> **Class:** `super()` = go to parent constructor 🏗️
> **Interface:** `InterfaceName.super.method()` = pick method from blueprint set 🧩

---

### ✅ Conclusion:

* Use `super()` in constructors to initialize parent class.
* Use `super.method()` in classes to access overridden behavior.
* Use `InterfaceName.super.method()` only when handling **default method conflicts** between interfaces.

> 🔐 Reminder: Interface inheritance is about **contracts**, not construction.

---
