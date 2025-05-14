# 🌟 Java Enum Class

## 📘 Definition

In Java, an `enum` (short for *enumeration*) is a special data type used to define a fixed set of constants. Enums provide a type-safe way to represent predefined values and are commonly used when you have a limited set of options, such as days of the week, user roles, directions, etc.

---

## 🎯 Why Use Enums?

Enums are beneficial because they:

* Improve **code readability** by giving meaningful names to constants.
* Provide **type safety**, preventing invalid values from being used.
* Are **easy to use** in switch statements or logic branching.
* Help with **code maintenance** by grouping related constants.

---

## 📚 Built-in Methods of Enum

| 🔧 Built-in Method | 📌 Description |
|--------------------|----------------|
| `name()`           | 🔁 Returns the **exact name** of the enum constant as a `String`. |
| `ordinal()`        | 🔢 Returns the **position/index** of the enum (starts from `0`). |
| `values()`         | 📋 Returns an **array** of all enum constants. |
| `valueOf(String)`  | 🔍 Converts a `String` to the matching enum constant (case-sensitive). |

---


## 🧠 Basic Enum Syntax

```java
public enum Role {
    KING, PRINCE, DUKE, COMMONER;
}
```

> ✅ Enum constants are written in UPPERCASE by convention.

---

## 👑 Case Study: Royal Character Roles

We’ll create an enum `Role` to define character roles within a kingdom. Then, we’ll use this enum inside a `Character` class.

### 📄 Full Example:

```java
// Defining an enum
enum Role {
    KING, PRINCE, DUKE, COMMONER;
}

// Using enum in a class
public class Character {
    private String name;
    private Role role;

    public Character(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void introduce() {
        System.out.println("Hello, I'm " + name + " and my role is " + role);
    }

    public static void main(String[] args) {
        Character dokja = new Character("Dokja", Role.KING);
        Character jeha = new Character("Jeha", Role.PRINCE);
        Character hamin = new Character("Hamin", Role.DUKE);
        Character dazai = new Character("Dazai", Role.COMMONER);

        dokja.introduce();
        jeha.introduce();
        hamin.introduce();
        dazai.introduce();
    }
}
```

### 📸 Output:

```
Hello, I'm Dokja and my role is KING
Hello, I'm Jeha and my role is PRINCE
Hello, I'm Hamin and my role is DUKE
Hello, I'm Dazai and my role is COMMONER
```

---

## 🔍 Explanation

* `enum Role`: defines a set of named constants.
* `Character` class: holds a `name` and a `role` of type `Role`.
* `introduce()`: prints out a simple introduction.
* In the `main()` method, we instantiate multiple characters with different roles.

---

## 💡 Advanced Enum Features

Java enums can:

* Contain **fields**, **methods**, and **constructors**.
* Be used in **switch** statements.
* Implement **interfaces** (though not extend classes).

### ✅ Enum with Descriptions

```java
enum Role {
    KING("Ruler of the kingdom"),
    PRINCE("Heir to the throne"),
    DUKE("Noble rank"),
    COMMONER("Ordinary citizen");

    private final String description;

    // Private constructor
    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // ✨ Enum Method Example
    public boolean isNoble() {
        return this == KING || this == PRINCE || this == DUKE;
    }
}
```

### 🔄 Using Descriptions & Methods

```java
public class Main {
    public static void main(String[] args) {
        for (Role role : Role.values()) {
            System.out.println(role + ": " + role.getDescription());
            System.out.println("Is noble? " + role.isNoble());
            System.out.println("----");
        }
    }
}
```

### 📸 Output:

```
KING: Ruler of the kingdom
Is noble? true
----
PRINCE: Heir to the throne
Is noble? true
----
DUKE: Noble rank
Is noble? true
----
COMMONER: Ordinary citizen
Is noble? false
----
```

---

## 🔀 Enum in Switch Statement

```java
Role currentRole = Role.KING;

switch (currentRole) {
    case KING:
        System.out.println("Welcome, Your Majesty.");
        break;
    case PRINCE:
        System.out.println("Greetings, Your Highness.");
        break;
    case DUKE:
        System.out.println("Good day, noble Duke.");
        break;
    case COMMONER:
        System.out.println("Hello, citizen.");
        break;
}
```

---

## 🔁 Converting Between Strings and Enums

### 1⃣ String to Enum (Using `valueOf()`)

```java
String input = "DUKE";
Role role = Role.valueOf(input);
System.out.println("Converted role: " + role);
```

> ⚠️ Throws `IllegalArgumentException` if input doesn't match any enum constant.

To avoid exception:

```java
public static Role safeValueOf(String input) {
    try {
        return Role.valueOf(input.toUpperCase());
    } catch (IllegalArgumentException e) {
        System.out.println("Invalid role name: " + input);
        return null;
    }
}
```

### 2⃣ Enum to String

```java
Role role = Role.PRINCE;
String roleString = role.name();
System.out.println("Role as String: " + roleString);
```

> `name()` returns the exact name of the enum constant.

### 3⃣ Enum to Description (Custom Output)

```java
Role role = Role.COMMONER;
System.out.println("Description: " + role.getDescription());
```

### 🧪 Combined Example

```java
public class EnumConversionDemo {
    public static void main(String[] args) {
        String input = "king";
        Role role = safeValueOf(input);

        if (role != null) {
            System.out.println("Enum: " + role);
            System.out.println("Description: " + role.getDescription());
            System.out.println("Is noble? " + role.isNoble());
        }
    }

    public static Role safeValueOf(String input) {
        for (Role r : Role.values()) {
            if (r.name().equalsIgnoreCase(input)) {
                return r;
            }
        }
        System.out.println("Invalid input: " + input);
        return null;
    }
}
```

### 📸 Output:

```
Enum: KING
Description: Ruler of the kingdom
Is noble? true
```

---

## 📟 Summary

| Feature              | Enum Support                |
| -------------------- | --------------------------- |
| Constants            | ✅ Yes                       |
| Constructor          | ✅ Private only              |
| Fields & Methods     | ✅ Yes                       |
| Implements Interface | ✅ Yes                       |
| Inheritance          | ❌ Cannot extend classes     |
| String Conversion    | ✅ With valueOf() and name() |
| Custom Methods       | ✅ Yes (e.g. `isNoble()`)    |

---

## 📚 References

* [Java Official Enum Documentation](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)
* [Baeldung - Guide to Java Enums](https://www.baeldung.com/java-enum)

---

Keep experimenting and using enums to write cleaner and safer code! 🚀
