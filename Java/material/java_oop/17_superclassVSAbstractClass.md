# Superclass vs Abstract Class in Java

## 📌 What is a Superclass?
A **superclass** is a parent class from which other classes (subclasses) inherit using the `extends` keyword. A regular superclass can be instantiated, and its methods are not necessarily required to be overridden by subclasses.

### ✅ Example of a Regular Superclass
```java
// Regular superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() { // Can be used directly without overriding
        System.out.println(name + " makes a sound! 🔊");
    }
}

// Subclass
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Mochi");
        myCat.makeSound(); // Mochi makes a sound! 🔊
    }
}
```

### 🔍 Explanation:
- `Animal` is a **regular superclass**.
- The `makeSound()` method already has an implementation, so `Cat` **does not need to override it**.
- You can create an instance of `Animal` directly.

---

## 📌 What is an Abstract Class?
An **abstract class** is a superclass that serves as a blueprint but **cannot be instantiated directly**. Any `abstract` method declared in it **must** be implemented by subclasses.

### ✅ Example of an Abstract Class
```java
// Abstract superclass
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); // Must be implemented in the subclass
}

// Subclass
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow! 😺");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal("Mochi"); ❌ ERROR: Cannot instantiate an abstract class!
        Cat myCat = new Cat("Mochi");
        myCat.makeSound(); // Mochi says: Meow! 😺
    }
}
```

### 🔍 Explanation:
- `Animal` is an **abstract class**, so **it cannot be instantiated directly**.
- The `makeSound()` method is abstract, so **it must be implemented** in the subclass `Cat`.
- If `Cat` does not override `makeSound()`, an error will occur.

---

## 📊 Comparison: Superclass vs Abstract Class

| **Feature**               | **Regular Superclass (`extends`)** | **Abstract Class (`extends`)** |
|---------------------------|----------------------------------|----------------------------------|
| **Can be instantiated?**  | ✅ Yes | ❌ No (must have a subclass) |
| **Must have abstract methods?** | ❌ No | ✅ Yes (at least one) |
| **Methods must be overridden?** | ❌ No | ✅ Yes, for abstract methods |
| **Usage**                 | Can be used directly | Acts as a blueprint for subclasses |

---

## 🎯 **Conclusion:**
- A **regular superclass** can be used directly, and its methods can be inherited without being overridden.
- An **abstract class** is still a superclass but is meant to serve as a blueprint, requiring subclasses to implement its abstract methods.

Thus, **an abstract class is still a superclass**, but it enforces method implementation rules! 🚀

