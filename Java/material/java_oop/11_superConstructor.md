# 🏗️ Super Constructor in Java

## 📌 Introduction
In Java, the `super` keyword is used to refer to the parent class. When used with constructors, `super()` allows a subclass to call a constructor from its superclass. This is crucial for proper inheritance and initialization of parent class properties.

## 🎯 Purpose of Super Constructor
- To initialize parent class properties in a subclass.
- To reuse the constructor of the superclass, avoiding redundant code.
- To ensure proper execution of the parent class's constructor before the subclass's constructor.

## 🛠️ Syntax
```java
super(); // Calls the no-argument constructor of the parent class
super(parameters); // Calls the parameterized constructor of the parent class
```

### 🔹 Important Notes
- `super()` must be the first statement in the subclass constructor.
- If not explicitly called, Java automatically inserts `super();` for the no-argument constructor.
- It cannot be used outside a constructor.

## 📌 Example 1: Using `super()` in Default Constructor
```java
class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Explicit call to the Parent constructor
        System.out.println("Child class constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
```
### 🖥️ Output:
```
Parent class constructor
Child class constructor
```

## 📌 Example 2: Using `super()` with Parameterized Constructor
```java
class Parent {
    Parent(String name) {
        System.out.println("Parent class constructor: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name); // Passing parameter to Parent constructor
        System.out.println("Child class constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child("Java");
    }
}
```
### 🖥️ Output:
```
Parent class constructor: Java
Child class constructor
```

## 📌 Example 3: Calling a Superclass Method Using `super`
```java
class Parent {
    void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls display() method from Parent class
        System.out.println("Display method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
```
### 🖥️ Output:
```
Display method in Parent class
Display method in Child class
```

## 🎯 Key Takeaways
✅ `super()` is used to call a superclass constructor.
✅ It must be the first statement in a subclass constructor.
✅ Java inserts `super();` automatically if no constructor is explicitly defined.
✅ `super.methodName()` is used to call a parent class method.

🔹 By understanding `super`, we can properly manage inheritance and constructor chaining in Java! 🚀
