# 🐍 Error & Exception Handling in Python

Understanding how to handle **errors** and **exceptions** in Python is essential to write robust, stable, and user-friendly programs 🚫✅.

---

## 📌 What are Errors and Exceptions?

| Type       | Description                                                                 |
|------------|-----------------------------------------------------------------------------|
| **Error**      | Critical issues that usually crash the program (like syntax mistakes).       |
| **Exception**  | Problems that happen during runtime and **can be handled** by the program.   |

### 🧠 Example:
```python
# ❌ Error (SyntaxError)
print("Hello"  # missing closing bracket

# ❌ Exception (ZeroDivisionError)
a = 10 / 0
```

---

## 🔧 try - except Block

Used to catch and handle exceptions gracefully.

### 📎 Syntax:
```python
try:
    # code that might cause an exception
except ExceptionType:
    # code that runs if an exception occurs
```

### 👀 Example:
```python
try:
    number = int(input("Enter a number: "))  # Jeha inputs: 0
    result = 10 / number
    print("Result:", result)
except ZeroDivisionError:
    print("❌ You cannot divide by zero!")
except ValueError:
    print("❌ Please enter a valid number!")
```

### 🧾 Output:
```
Enter a number: 0
❌ You cannot divide by zero!
```

---

## 🪛 try - except - else

`else` block will only run **if no exceptions occur** in the `try` block.

### 📎 Syntax:
```python
try:
    # risky code
except SomeException:
    # handle the exception
else:
    # run if no exception occurred
```

### 👀 Example:
```python
try:
    age = int(input("Enter your age: "))  # Dokja inputs: 22
except ValueError:
    print("❌ That's not a valid number!")
else:
    print("✅ Your age is", age)
```

### 🧾 Output:
```
Enter your age: 22
✅ Your age is 22
```

---

## 🧹 finally Block

The `finally` block is **always executed**, no matter if there was an error or not. Useful for cleanup operations like closing files or releasing resources.

### 📎 Syntax:
```python
try:
    # risky code
except:
    # handle error
finally:
    # always executed
```

### 👀 Example:
```python
try:
    file = open("info.txt", "r")  # Hamin tries to read a file
    content = file.read()
    print(content)
except FileNotFoundError:
    print("❌ File not found!")
finally:
    print("📦 Done trying to access the file.")
```

### 🧾 Output:
```
❌ File not found!
📦 Done trying to access the file.
```

---

## 🌀 Catching All Exceptions (Not Recommended)

You can catch all exceptions without specifying the type, but this is **not recommended** since it can hide important bugs.

### 👀 Example:
```python
try:
    print(Dazai)  # Dazai is not defined
except:
    print("⚠️ Something went wrong!")
```

### 🧾 Output:
```
⚠️ Something went wrong!
```

> ⚠️ **Tip:** Always catch specific exceptions for clarity and better debugging.

---

## 🧩 Common Exceptions in Python

Here's a list of common exception types you might encounter:

| Exception Type         | Description |
|------------------------|-------------|
| `ValueError`           | Raised when a function receives an argument of the right type but an inappropriate value. |
| `TypeError`            | Raised when an operation or function is applied to an object of inappropriate type. |
| `ZeroDivisionError`    | Raised when trying to divide by zero. |
| `IndexError`           | Raised when accessing an index that is out of range. |
| `KeyError`             | Raised when accessing a non-existent key in a dictionary. |
| `FileNotFoundError`    | Raised when a file or directory is requested but doesn’t exist. |
| `NameError`            | Raised when a variable is not defined. |
| `AttributeError`       | Raised when an attribute reference or assignment fails. |

### 🔍 Example (ValueError):
```python
try:
    number = int("Calista")  # can't convert string to int
except ValueError:
    print("❌ You entered an invalid number!")
```

### 🧾 Output:
```
❌ You entered an invalid number!
```

---

## 🧠 Summary

- Use `try - except` to handle runtime issues.
- Add `else` to run code only when no exception occurs.
- Use `finally` to ensure cleanup actions always run.
- Avoid generic `except:` unless absolutely necessary.
- Familiarize yourself with common exception types like `ValueError`, `TypeError`, and `IndexError`.

---

Keep your code calm even when things go wrong 😎✨
Exception handling helps your program handle unexpected situations like a pro! 💪

