# 📦 Java Packages

## 🎯 Purpose

This markdown file introduces the concept of **Java Packages** in a clear, engaging way. It is designed for learners who want a practical understanding of how Java organizes code using packages.

## 📚 Theoretical Explanation

A **package** in Java is a namespace that organizes classes and interfaces. It helps keep your code tidy and avoid name conflicts. Think of it like folders on your computer, where each folder stores files with related purposes.

### Why Use Packages?
- 🚫 **Avoid naming conflicts:** You can have multiple classes named `Helper` if they’re in different packages.
- 🗂️ **Organize your project:** Group related code together for clarity and maintenance.
- 🔐 **Control access:** Use access modifiers (`public`, default) to limit visibility.
- 🔄 **Promote reusability:** Once created, packages can be reused in other projects.

### Built-in Java Packages:
- `java.util` – contains useful utility classes like `ArrayList`, `HashMap`, etc.
- `java.io` – for reading and writing files.
- `java.net` – for networking-related classes.

## 💻 Code Examples and Output

### ✅ Example 1: Creating and Using a Package
```java
// File: mystory/HelloDokja.java
package mystory;

public class HelloDokja {
    public void sayHi() {
        System.out.println("Hello from Dokja's package!");
    }
}
```

```java
// File: Main.java
import mystory.HelloDokja;

public class Main {
    public static void main(String[] args) {
        HelloDokja dokja = new HelloDokja();
        dokja.sayHi();
    }
}
```

### 💬 Output:
```
Hello from Dokja's package!
```

### ✅ Example 2: Multiple Classes in a Package
```java
// File: team/Jeha.java
package team;

public class Jeha {
    public void speak() {
        System.out.println("Jeha is debugging...");
    }
}

// File: team/Hamin.java
package team;

public class Hamin {
    public void code() {
        System.out.println("Hamin is compiling Java code 🚀");
    }
}

// File: team/Dazai.java
package team;

public class Dazai {
    public void test() {
        System.out.println("Dazai is running unit tests 🧪");
    }
}
```

```java
// File: Main.java
import team.*;

public class Main {
    public static void main(String[] args) {
        Jeha jeha = new Jeha();
        Hamin hamin = new Hamin();
        Dazai dazai = new Dazai();

        jeha.speak();
        hamin.code();
        dazai.test();
    }
}
```

### 💬 Output:
```
Jeha is debugging...
Hamin is compiling Java code 🚀
Dazai is running unit tests 🧪
```

## 🧠 Conclusion

Java packages help organize and modularize code efficiently. They provide structure, prevent naming conflicts, and encourage good coding practices. By using packages, developers like Dokja, Jeha, Hamin, and Dazai can collaborate smoothly and keep their codebases neat and manageable. ✨

> Remember: Clean structure = happy developer! 🧼👩‍💻

