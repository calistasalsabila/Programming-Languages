# 🧨 RunTime Exception in Java

## 📘 Definition

A **RunTime Exception** is a type of exception that occurs during the execution of a program (i.e., at *runtime*). These exceptions are **unchecked**, meaning the Java compiler does not require the programmer to handle them explicitly using `try-catch` blocks or declare them with the `throws` keyword.

RunTime Exceptions are subclasses of `java.lang.RuntimeException`, which itself is a subclass of `java.lang.Exception`.

---

## 🎯 Purpose

The main goal of understanding and handling RunTime Exceptions is to:

* Prevent program crashes caused by *unexpected errors* 💥
* Build more *robust* and *fault-tolerant* applications
* Help developers identify **logical bugs** in code

---

## 📂 Common RunTime Exceptions

Here are some commonly encountered RunTime Exceptions:

| Exception                        | Description                                             |
| -------------------------------- | ------------------------------------------------------- |
| `NullPointerException`           | Accessing a method or variable using a `null` reference |
| `ArrayIndexOutOfBoundsException` | Accessing an array element with an invalid index        |
| `ArithmeticException`            | Division by zero or other illegal arithmetic operation  |
| `ClassCastException`             | Improper type casting                                   |
| `IllegalArgumentException`       | Illegal or inappropriate argument passed to a method    |

---

## 💡 Example Code

Let's look at some examples to understand RunTime Exceptions:

### 🚫 Example 1: NullPointerException

```java
String name = null;
System.out.println(name.length()); // ❌ This throws NullPointerException
```

**Output:**

```
Exception in thread "main" java.lang.NullPointerException
```

---

### 🚫 Example 2: ArrayIndexOutOfBoundsException

```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[5]); // ❌ Index 5 does not exist
```

**Output:**

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
```

---

### 🚫 Example 3: ArithmeticException

```java
int x = 10;
int y = 0;
System.out.println(x / y); // ❌ Cannot divide by zero
```

**Output:**

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```

---

## 🛠️ Handling RunTime Exceptions

Although not mandatory, handling RunTime Exceptions is a good practice:

```java
try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

**Output:**

```
Cannot divide by zero!
```

---

## 🧠 Tips to Avoid RunTime Exceptions

* Always **check for null** before accessing object methods or variables ✅
* Use **`try-catch`**\*\* blocks\*\* for operations prone to failure 💡
* **Validate user input** and arguments before using them 🛡️
* Use modern Java features like `Optional` when dealing with potentially null values 🌿

---

## 📌 Summary

* RunTime Exceptions happen during execution and are **unchecked**
* They point to programming bugs or unexpected states
* Java does not require them to be caught, but handling them can improve program stability ⚙️
* Common examples: `NullPointerException`, `ArithmeticException`, etc.

> ⚠️ Always write clean and defensive code to minimize RunTime Exceptions!

---
