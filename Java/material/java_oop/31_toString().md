# ☕ `toString()` Method in Java

Understand how to customize object representation in Java using the powerful `toString()` method. Essential for debugging, logging, and readable outputs! 🧾🔍

---

## 🧠 What is `toString()`?

The `toString()` method is defined in the `Object` class and is meant to return a **string representation** of an object.

> 📌 By default, it returns something like: `ClassName@Hashcode`

To make it meaningful, we **override** it in our custom classes.

---

## 🎯 Purpose of Overriding `toString()`

* Print object data in a readable format
* Useful for debugging/logging
* Automatically called when printing an object

---

## 🛠️ Syntax

```java
@Override
public String toString() {
    return "..."; // return formatted string
}
```

---

## 🧪 Example 

### 🔧 Without `toString()`

```java
class Dokja {
    String name = "Kim Dokja";
    int age = 25;
}

public class Main {
    public static void main(String[] args) {
        Dokja d = new Dokja();
        System.out.println(d); // Output: Dokja@6bc7c054
    }
}
```

### ✅ With Overridden `toString()`

```java
class Hamin {
    String name = "Lee Hamin";
    int age = 21;

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Hamin h = new Hamin();
        System.out.println(h); // Output: Name: Lee Hamin, Age: 21
    }
}
```

---

## 🔁 Key Points

* `toString()` is called automatically in `System.out.println(object)`.
* It is a good practice to override it for custom classes.
* Helps in testing, debugging, or logging.

---

## 🧠 Mini Summary

| Feature             | Default Behavior     | Customizable | Auto-invoked |
| ------------------- | -------------------- | ------------ | ------------ |
| `toString()` method | `ClassName@hashcode` | ✅ Yes        | ✅ Yes        |

---

## 🌟 Pro Tips

* Use `@Override` to avoid typos when overriding.
* You can include all relevant object fields in `toString()`.
* Combine with `String.format()` for cleaner formatting.

---

## 🌟 Conclusion

Customizing `toString()` is a simple but powerful way to improve your Java class usability, especially when working with logs or debugging complex systems. Always override it for better clarity! ✅📘
