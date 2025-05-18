# 🔍 Java Reflection

## 📘 Definition

Reflection in Java is a powerful feature that allows a program to **inspect and manipulate classes, methods, fields, and constructors at runtime**, even if they are private. It is part of the `java.lang.reflect` package.

## 🎯 Purpose

* Analyze class information at runtime 🕵️‍♀️
* Call methods dynamically ⚙️
* Access private fields 🔓
* Useful for frameworks, debugging tools, testing libraries, etc.

## 🧱 Key Classes in Reflection API

| Class         | Description                                                   |
| ------------- | ------------------------------------------------------------- |
| `Class`       | Represents a class or interface in a running Java application |
| `Method`      | Represents a method of a class                                |
| `Field`       | Represents a field (variable) of a class                      |
| `Constructor` | Represents a constructor of a class                           |

## 🔧 Getting Class Object

There are several ways to get a `Class` object:

```java
Class<?> cls1 = MyClass.class;                    // Using .class
Class<?> cls2 = new MyClass().getClass();        // From object
Class<?> cls3 = Class.forName("MyClass");       // Using fully-qualified name
```

## 📦 Example Class

```java
public class Dokja {
    private String secret = "Omniscient Reader";

    public void greet() {
        System.out.println("Hello from Dokja");
    }

    private void whisper() {
        System.out.println("You shouldn't see this...");
    }
}
```

## 🧪 Example: Access Methods and Fields

```java
import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Dokja");

        Object obj = cls.getDeclaredConstructor().newInstance();

        // 🔍 List all methods
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
        }

        // ⚙️ Call public method
        Method greetMethod = cls.getMethod("greet");
        greetMethod.invoke(obj);

        // 🔓 Call private method
        Method whisperMethod = cls.getDeclaredMethod("whisper");
        whisperMethod.setAccessible(true);
        whisperMethod.invoke(obj);

        // 🧪 Access private field
        Field field = cls.getDeclaredField("secret");
        field.setAccessible(true);
        System.out.println("Secret: " + field.get(obj));
    }
}
```

### 📤 Output

```
Method: greet
Method: whisper
Hello from Dokja
You shouldn't see this...
Secret: Omniscient Reader
```

## 🎯 Use Cases

* 📚 Frameworks (like Spring, Hibernate)
* 🔍 IDEs and debuggers
* 🧪 Unit testing (e.g., JUnit)
* 🛠️ Code analysis tools
* 📦 Serialization libraries

## ⚠️ Pros and Cons

### ✅ Pros

* Extremely powerful
* Enables flexible and dynamic applications

### ❌ Cons

* Slower than regular code (due to runtime checks)
* Breaks encapsulation (can access private members)
* May cause security issues

## 🛡️ Tips

* Use reflection only when absolutely necessary.
* Prefer standard method access whenever possible.
* Combine with annotations for powerful behavior!

---

Java Reflection: A mirror to your code’s soul 🪞✨
Great job diving deep, Dokja, Jeha, Hamin, and Dazai! 🚀💻
