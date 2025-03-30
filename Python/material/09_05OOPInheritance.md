# Inheritance in Python

## 🏆 Objective
Understand the concept of inheritance in Python, how it works, and how to implement it effectively.

## 📖 Theory Explanation
Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a class (child class) to inherit attributes and methods from another class (parent class). This promotes code reusability and hierarchy in class design.

### Key Points:
- The parent class is also called the **base class**.
- The child class is also called the **derived class**.
- The child class inherits all public and protected attributes and methods from the parent class.
- The child class can **override** or **extend** the functionalities of the parent class.
- Python supports **single inheritance**, **multiple inheritance**, **multilevel inheritance**, and **hierarchical inheritance**.

## 💻 Code Examples and Output

### 1️⃣ Basic Inheritance Example
```python
# Parent Class
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def introduce(self):
        return f"Hello, my name is {self.name} and I am {self.age} years old."

# Child Class
class Student(Person):
    def __init__(self, name, age, major):
        super().__init__(name, age)  # Call the parent class constructor
        self.major = major
    
    def introduce(self):  # Method Overriding
        return f"Hello, my name is {self.name}, I am {self.age} years old, and I study {self.major}."

# Creating objects
dokja = Person("Dokja", 25)
jeha = Student("Jeha", 20, "Computer Science")

# Output
print(dokja.introduce())  # Output: Hello, my name is Dokja and I am 25 years old.
print(jeha.introduce())   # Output: Hello, my name is Jeha, I am 20 years old, and I study Computer Science.
```

### 2️⃣ Multilevel Inheritance
```python
class Animal:
    def speak(self):
        return "Animals make sounds."

class Mammal(Animal):
    def has_fur(self):
        return True

class Dog(Mammal):
    def speak(self):
        return "Woof! Woof! 🐶"

hamin = Dog()
print(hamin.speak())   # Output: Woof! Woof! 🐶
print(hamin.has_fur()) # Output: True
```

### 3️⃣ Multiple Inheritance
```python
class Artist:
    def draw(self):
        return "Creating art 🎨."

class Musician:
    def play_music(self):
        return "Playing music 🎵."

class MultiTalented(Artist, Musician):
    def perform(self):
        return "I can do both! 🎭"

dazai = MultiTalented()
print(dazai.draw())      # Output: Creating art 🎨.
print(dazai.play_music()) # Output: Playing music 🎵.
print(dazai.perform())   # Output: I can do both! 🎭
```

## 🔍 Conclusion
- Inheritance allows a class to **reuse** and **extend** functionalities from a parent class.
- Python supports **multiple types** of inheritance like **single, multilevel, and multiple inheritance**.
- The `super()` function is used to **call methods from the parent class**.
- Method overriding enables a child class to **modify behavior** from the parent class.

Inheritance makes code more **efficient, reusable, and organized**. 🚀

