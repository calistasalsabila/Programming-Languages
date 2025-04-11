# 📦 Java Package 

## 🎯 Goal

To understand how to use and implement packages in Java, including how to organize classes across different files and folders, and how to access them properly.

## 🧠 Theory Explanation

### What is a Package?

In Java, a **package** is a namespace that organizes a set of related classes and interfaces. Think of it like a folder that helps avoid name conflicts and controls access.

- Similar to `import` in Python, but more structured.
- Java enforces packages as part of its compilation and execution flow.

### Why Use Packages?

✅ Helps organize code logically\
✅ Prevents name conflicts\
✅ Allows controlled access with access modifiers\
✅ Easier for modular development

### Default Package vs Named Package

- **Default package**: Classes without any package declaration.
- **Named package**: Classes with `package com.example.project;` at the top, and usually saved inside a folder matching the name.

### Access Modifiers Recap

| Modifier    | Same Class | Same Package | Subclass | Other Packages      |
| ----------- | ---------- | ------------ | -------- | ------------------- |
| `public`    | ✅          | ✅            | ✅        | ✅                   |
| `protected` | ✅          | ✅            | ✅        | ❌ (except subclass) |
| `default`   | ✅          | ✅            | ❌        | ❌                   |
| `private`   | ✅          | ❌            | ❌        | ❌                   |

## 💻 Code Example & Output

### File Structure

```
src/
├── javapackage/
│   ├── App.java
│   └── data/
│       └── A.java
```

### A.java (in `javapackage/data/`)

```java
package javapackage.data;

public class A {
    private String name;
    private int nim;

    public A(String name, int nim) {
        this.name = name;
        this.nim = nim;
    }

    public void show() {
        System.out.println("Name: " + name + ", NIM: " + nim);
    }
}
```

### App.java (in `javapackage/`)

```java
package javapackage;

import javapackage.data.A;

public class App {
    public static void main(String[] args) {
        A mahasiswa = new A("Dokja", 120001);
        mahasiswa.show();
    }
}
```

### ✅ Output

```
Name: Dokja, NIM: 120001
```

## 💡 Real-World Analogy

Imagine you have different folders for organizing subjects in a binder: `Math`, `Science`, `English`. Inside each folder, there are notes (classes). Packages in Java work exactly like that! It helps avoid mixing up "notes" that might have the same title but different contents.

## 🔍 Tips

- Use consistent naming like `com.yourname.projectname`.
- Match folder names to package names!
- Use IDE features to auto-generate package structure and fix imports.

## 🧾 Summary

- A **package** is a folder-like system to organize Java classes.
- You can **import** classes from another package using `import`.
- Classes in the **same package** can access each other (with default/protected/public modifiers).
- Use packages to make your code clean, scalable, and professional!

✨ Now you’re ready to structure your Java projects like a pro! 💪

