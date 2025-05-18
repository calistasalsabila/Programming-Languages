# 🏷️ Java Annotations

## 📘 Definition

Annotations in Java are **metadata** that provide data about a program but are **not part of the program logic**. They can be used by the compiler or at runtime to generate code, perform checks, or affect the behavior of the program.

Introduced in Java 5, annotations are widely used in frameworks (like Spring, JUnit) and for configuration purposes.

## 🎯 Purpose

* Provide metadata
* Reduce boilerplate code
* Assist in compile-time or runtime processing
* Enable declarative programming

## 🧱 Basic Syntax

```java
@AnnotationName(parameter1 = value1, parameter2 = value2)
```

Or simply:

```java
@AnnotationName
```

You can apply annotations to:

* Classes
* Methods
* Fields
* Parameters
* Local variables

## 🧪 Built-in Annotations

### ✅ @Override

Indicates that a method **overrides** a method from its superclass.

```java
@Override
public String toString() {
    return "Dokja";
}
```

### 🚫 @Deprecated

Marks a method/class as **deprecated** and should not be used.

```java
@Deprecated
public void oldMethod() {
    // use newMethod() instead
}
```

### 🛡️ @SuppressWarnings

Tells the compiler to **ignore specific warnings**.

```java
@SuppressWarnings("unchecked")
List rawList = new ArrayList();
```

## ✍️ Custom Annotations

You can define your own annotations using `@interface` keyword:

```java
@interface Info {
    String author();
    int version();
}

@Info(author = "Jeha", version = 1)
public class MyClass {
    // ...
}
```

## 🧪 Example: Custom Annotation with Reflection

```java
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info {
    String author();
    int version();
}

@Info(author = "Hamin", version = 2)
class Example {
    // class contents
}

public class Main {
    public static void main(String[] args) {
        Class<Example> obj = Example.class;
        Info info = obj.getAnnotation(Info.class);

        System.out.println("Author: " + info.author());
        System.out.println("Version: " + info.version());
    }
}
```

### 📤 Output

```
Author: Hamin
Version: 2
```

## 🎯 Annotation Meta-Annotations

These are annotations used **to define annotations**:

| Meta-Annotation | Description                                                                        |
| --------------- | ---------------------------------------------------------------------------------- |
| `@Retention`    | Specifies if the annotation is available at **SOURCE**, **CLASS**, or **RUNTIME**. |
| `@Target`       | Specifies the elements this annotation can be applied to (e.g., TYPE, METHOD).     |
| `@Inherited`    | Indicates that the annotation can be inherited by subclasses.                      |
| `@Documented`   | Indicates that the annotation should be included in the JavaDoc.                   |

### 📌 Example

```java
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Marker {
    String value();
}
```

## 🏁 Summary

| Annotation          | Use Case                                                        |
| ------------------- | --------------------------------------------------------------- |
| `@Override`         | When overriding a method from a superclass                      |
| `@Deprecated`       | To mark old methods/classes that should no longer be used       |
| `@SuppressWarnings` | To avoid compiler warnings                                      |
| Custom Annotations  | To define your own metadata and use it with tools or reflection |

## 💡 Tips

* Always use `@Override` when overriding — it catches mistakes early!
* Custom annotations + reflection = powerful tool for frameworks ⚙️
* Annotations do nothing by themselves — they need to be processed!

---
