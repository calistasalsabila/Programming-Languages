# 🧠 Hiding Variable vs Method Overriding in Java

## ✨ Definition

In Java, **Hiding Variable** and **Method Overriding** are two different concepts related to inheritance.

- **Hiding Variable**: Occurs when a subclass declares a field with the same name as a field in the superclass. This hides the superclass's field, even though it is still present in memory.

- **Method Overriding**: Happens when a subclass provides a specific implementation for a method that is already defined in its superclass.

---

## 🌟 Purpose

| Concept           | Purpose                                                                 |
|------------------|-------------------------------------------------------------------------|
| Hiding Variable   | To declare a new field with the same name, but **not** override behavior. |
| Method Overriding | To change or extend the behavior of the superclass method.              |

---

## 🧠 Common Syntax in Inheritance

```java
Parent parent = child;
```

- `Parent` → the **reference type** (superclass)
- `parent` → the **reference variable**
- `child` → the **actual object** (instance of subclass)

🧩 This allows **polymorphism** — where the reference is of type `Parent`, but the actual object is a `Child`. 
This is key to understanding how method overriding works vs. variable hiding.

---

## 👨‍💻 Example Code

```java
class Person {
    String name = "Dokja";

    void introduce() {
        System.out.println("Hi, I'm " + name);
    }
}

class Student extends Person {
    String name = "Jeha"; // Variable hiding

    @Override
    void introduce() { // Method overriding
        System.out.println("Hi, I'm " + name + " (a student)");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Student();

        System.out.println("Accessing variable: " + p.name); // Hiding Variable
        p.introduce(); // Method Overriding
    }
}
```

---

## 📄 Output

```
Accessing variable: Dokja
Hi, I'm Jeha (a student)
```

---

## 🔍 Explanation

Let's break it down:

1. **Variable Hiding**
   - In the class `Student`, we declare a variable `name` that has the **same name** as in the superclass `Person`.
   - However, **Java does not override fields**. Fields are resolved **at compile time** based on the **reference type**, not the object type.
   - So even though `p` is a `Student`, because the reference type is `Person`, `p.name` refers to `"Dokja"`.

2. **Method Overriding**
   - The `introduce()` method is **overridden** in the `Student` class.
   - Java resolves method calls **at runtime** using the **actual object type**, not the reference type.
   - Since `p` is pointing to a `Student` object, the overridden `introduce()` in `Student` is called, printing `"Hi, I'm Jeha (a student)"`.

⚠️ **Important**:  
- Fields (variables) are **not polymorphic**.  
- Methods **are polymorphic** in Java.

---

## 📌 Conclusion

| Feature             | Hiding Variable                         | Method Overriding                            |
|---------------------|------------------------------------------|----------------------------------------------|
| Applies to          | Fields (variables)                      | Methods                                       |
| Resolved at         | Compile Time (based on reference type)  | Runtime (based on object type)               |
| Polymorphism        | ❌ No                                    | ✅ Yes                                         |
| Use case            | Declaring same-named field (not advised)| Extending or customizing superclass behavior |

🔀 In practice, method overriding is a key part of polymorphism and is widely used in Java OOP design.  
⛔ Variable hiding, on the other hand, can be confusing and is usually **discouraged**.

---

## 🧹 Bonus Tips

- ✅ Always prefer method overriding for customizing behavior.
- ❌ Avoid variable hiding as it reduces code clarity.
- 🧪 Try printing `((Student)p).name` and see how it accesses the hidden variable.

---

Hope this helps you understand the difference between Hiding Variables and Method Overriding clearly! 🚀

