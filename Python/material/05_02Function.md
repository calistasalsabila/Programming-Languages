# 🎯 Python Function Parameters & Arguments

## 📌 What are Parameters and Arguments?
- **Parameter**: A variable in the function definition.
- **Argument**: The actual value passed to the function when calling it.

---

## 🛠️ Syntax of Parameters & Arguments
```python
def greet(name):  # 'name' is a parameter
    print(f"Hello, {name}!")

# Calling the function with an argument
greet("Dokja")  # 'Dokja' is an argument
```
📝 **Output:**
```
Hello, Dokja!
```

---

## 🔄 Default Parameters
A default parameter is used when no argument is provided.

### 🔹 Example:
```python
def greet(name="Junghyuk"):
    print(f"Hello, {name}!")

# Calling the function with and without an argument
greet("Jeha")
greet()
```
📝 **Output:**
```
Hello, Jeha!
Hello, Junghyuk!
```

---

## 📋 List of Built-in Functions & Methods

| **Function/Method** | **Description** |
|--------------------|----------------|
| `len()`  | Returns the length of an object |
| `type()` | Returns the type of an object |
| `print()` | Outputs text to the console |
| `sum()` | Returns the sum of all items in an iterable |
| `.append()` | Adds an element to a list |
| `.pop()` | Removes and returns the last element of a list |

---

## 🔍 Checking Parameters of Built-in Functions
You can check the parameters of built-in functions using `help()` or `Shift + Tab` in Jupyter Notebook.

### 🔹 Using `help()`:
```python
help(print)
```
This will display detailed documentation about the `print()` function.

### 🔹 Using `Shift + Tab` (Jupyter Notebook)
Place the cursor inside the parentheses of a function and press `Shift + Tab` to see the parameter list.

---

🚀 Now you understand how to use function parameters efficiently in Python! Happy coding! 🎉
