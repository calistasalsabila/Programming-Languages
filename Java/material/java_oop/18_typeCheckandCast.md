# 📌 Type Checking and Type Casting in Java

## 🔍 Overview
In Java, **Type Checking** and **Type Casting** are fundamental concepts related to data types and their conversion. Java is a **strongly typed** language, meaning every variable must adhere to its declared type.

- **Type Checking** ensures that variables are used according to their type.
- **Type Casting** is the process of converting one data type to another, either explicitly or implicitly.

---

## 🔎 Type Checking
Type Checking in Java is divided into two types:

### 1️⃣ **Compile-Time Type Checking**
🛑 **Purpose:** Ensures type errors are detected before the program runs.
- Done at compile-time.
- Type mismatch errors prevent the code from compiling.
- Example:

```java
// ❌ Error due to incompatible types
int number = "Hello"; // Type mismatch: cannot convert from String to int
```

### 2️⃣ **Runtime Type Checking**
🔍 **Purpose:** Checks object types at runtime using `instanceof`.
- Used to ensure an object matches the expected type before casting.
- Example:

```java
Object obj = "Dokja"; // obj is a String but stored as an Object
if (obj instanceof String) {
    System.out.println("obj is a String"); // ✅ Output: obj is a String
}
```

---

## 🔄 Type Casting
Type Casting is divided into **Implicit Casting (Widening)** and **Explicit Casting (Narrowing)**.

### 1️⃣ **Implicit Casting (Widening Casting)**
🔄 **Purpose:** Converts a smaller type to a larger type automatically.
- No explicit casting required.
- Example:

```java
int age = 22;
double ageDouble = age; // ✅ Implicit casting: int -> double
System.out.println(ageDouble); // Output: 22.0
```

### 2️⃣ **Explicit Casting (Narrowing Casting)**
🛑 **Purpose:** Converts a larger type to a smaller type manually.
- Must be done explicitly using **(type)**.
- May result in data loss if the smaller type cannot store the full value.
- Example:

```java
double weight = 56.78;
int weightInt = (int) weight; // ✅ Explicit casting: double -> int
System.out.println(weightInt); // Output: 56 (decimal part is lost)
```

### 3️⃣ **Object Casting (Reference Type Casting)**
- Uses **Upcasting** and **Downcasting** to convert between a superclass and a subclass.

#### 🔹 **Upcasting (Implicit)**
🔄 **Purpose:** Converts a subclass to its superclass automatically.
- Happens implicitly.
- Example:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void makeSound() { // Overriding method
        System.out.println("Meow meow");
    }
}

Animal newAnimal = new Cat(); // ✅ Upcasting (Cat -> Animal)
newAnimal.makeSound(); // Output: Meow meow (overridden method is called)
```

#### 🔹 **Downcasting (Explicit)**
🛑 **Purpose:** Converts a superclass to a subclass; must be checked using `instanceof` to avoid errors.
- Must be done explicitly.
- Example:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow meow");
    }

    void meow() {
        System.out.println("Cat says meow");
    }
}

Animal animal = new Cat(); // Upcasting
animal.makeSound(); // Output: Meow meow (overridden method is called)

if (animal instanceof Cat) {
    Cat newCat = (Cat) animal; // ✅ Downcasting (Animal -> Cat)
    newCat.meow(); // Output: Cat says meow
}
```

---

## 🎯 Conclusion
✅ **Type Checking** prevents type errors before execution.  
✅ **Type Casting** allows type conversion.  
✅ **Implicit Casting** happens automatically, while **Explicit Casting** must be done manually.  
✅ **Upcasting** occurs automatically, but **Downcasting** requires `instanceof` for safety.  
✅ **Overridden methods in Upcasting** will execute the subclass's version instead of the superclass's.  

📚 Understanding these concepts helps us write safer and more efficient Java code! 🚀

