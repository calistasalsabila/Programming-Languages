# 🐍 Python Functions

## 📌 What is a Function?
A function in Python is a reusable block of code that performs a specific task. It helps in organizing code, improving readability, and avoiding redundancy.

## 🎯 Benefits of Using Functions
- ✅ Code reusability
- ✅ Better readability and maintainability
- ✅ Reduces redundancy
- ✅ Makes debugging easier

---

## 🛠️ Basics of Functions
A function is defined using the `def` keyword, followed by a function name and parentheses `()` that may contain parameters.

### 🔹 Defining a Function
```python
# Function Definition
def greet():
    print("Hello, World!")

# Function Call
greet()
```
📝 **Output:**
```
Hello, World!
```

---

## 🔄 The `return` Statement
A function can return a value using the `return` statement.

### 🔹 Syntax of `return`
```python
def square(num):
    return num * num

result = square(4)
print(result)
```
📝 **Output:**
```
16
```

---

## 📜 Using Docstrings (`Shift + Tab` for Documentation)
A **docstring** is a special string used to describe a function. It is written inside triple quotes (`"""` or `'''`).

### 🔹 Example:
```python
def add(a, b):
    """This function adds two numbers and returns the sum."""
    return a + b

print(add.__doc__)
```
📝 **Output:**
```
This function adds two numbers and returns the sum.
```

---

## 🏗️ Built-in Function: `help()`
The `help()` function is used to get documentation about functions, modules, or objects.

### 🔹 Example:
```python
help(print)
```
This will display detailed documentation about the `print()` function.

---

🚀 Now you're ready to create and use functions efficiently in Python! Happy coding! 🎉
