# 🚀 Java Method Chaining & Fluent Interface

## 📌 What is Method Chaining?
Method chaining is a technique in object-oriented programming where multiple methods are called on the same object in a single line of code. It allows for more concise and readable code by eliminating the need for temporary variables.

### 🎯 Purpose of Method Chaining:
✅ **Improves code readability** – Reduces the need for intermediate variables.  
✅ **Enhances maintainability** – Makes it easier to update and modify the code.  
✅ **Efficient programming** – Simplifies object modifications without redundant code.  

---

## 📌 Example of Method Chaining
### ✅ Example:
```java
String result = "hello".toUpperCase().replace("H", "J").concat(" WORLD");
System.out.println(result);  
```
### 🎯 Input & Output:
📝 **Input:** "hello"
🔍 **Process:**
1. Convert "hello" to uppercase → "HELLO"
2. Replace 'H' with 'J' → "JELLO"
3. Concatenate " WORLD" → "JELLO WORLD"

💡 **Output:**
```
JELLO WORLD
```

---

## 📌 Static Methods & Variables
Static members belong to the class rather than instances and can be accessed using the class name directly.

### ✅ Example:
```java
System.out.println(Math.pow(2, 3));  
System.out.println(Integer.MAX_VALUE); 
```
### 🎯 Input & Output:
📝 **Input:** 2, 3
🔍 **Process:** Compute 2³ using `Math.pow()`
💡 **Output:**
```
8.0
2147483647
```

---

## 📌 Fluent Interface & Builder Pattern
Fluent interfaces allow method chaining for object creation, often used in Builder Patterns to enhance object configuration.

### ✅ Example:
```java
class Person {
    private String name;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person().setName("Dokja").setAge(20);
        p.printPerson();  
    }
}
```
### 🎯 Input & Output:
📝 **Input:** "Dokja", 20
🔍 **Process:**
1. Set name → "Dokja"
2. Set age → 20
3. Print details

💡 **Output:**
```
Name: Dokja, Age: 20
```

---

## 🎯 Key Takeaways:
✅ **Method Chaining** makes code cleaner and more readable.  
✅ **Static Members** can be accessed using class names.  
✅ **Fluent Interface** is useful for object configuration.  

🚀 Keep coding efficiently! 💡

