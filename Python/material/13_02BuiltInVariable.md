# 🏷️ Python Built-in Variables

---

## 🔍 What Are Built-in Variables?

> **Built-in variables** in Python are special variables automatically defined and managed by the interpreter. They provide useful metadata and access to built-in functions, modules, and system-level information.

They are **always available** without needing to import anything.

---

## 📌 List of Important Built-in Variables

| Variable         | Description                                                  |
|------------------|--------------------------------------------------------------|
| `__name__`       | Indicates if the script is run directly or imported          |
| `__file__`       | File path of the script (only available in saved scripts)    |
| `__doc__`        | Docstring (documentation) of a module/class/function         |
| `__builtins__`   | Contains all built-in functions and exceptions               |
| `__package__`    | Package name where the module belongs                        |
| `__loader__`     | Loader used to import the module                             |
| `__spec__`       | Module spec (metadata about how module was loaded)           |
| `__cached__`     | Path to the compiled bytecode file                           |

---

## 🔹 `__name__`

### 📖 Purpose:
Tells you whether the Python file is being run directly or imported as a module.

### 💡 Usage Example:
```python
# File: test_script.py

def say_hi():
    print("Hi from test_script!")

if __name__ == "__main__":
    say_hi()
```
- When run directly: `__name__ == '__main__'` → function is executed
- When imported: `__name__ == 'test_script'` → function won’t run unless called

---

## 🔹 `__file__`

### 📖 Purpose:
Returns the path of the current file. Useful for locating resources.

### 💡 Usage Example:
```python
print(__file__)
# Output: full path to the current script (only if saved)
```

---

## 🔹 `__doc__`

### 📖 Purpose:
Gives access to the docstring (documentation) of an object.

### 💡 Usage Example:
```python
def greet():
    """This function prints a greeting."""
    print("Hello!")

print(greet.__doc__)  # Output: This function prints a greeting.
```

---

## 🔹 `__builtins__`

### 📖 Purpose:
Contains a module with all built-in functions, exceptions, and types.

### 💡 Usage Example:
```python
print(dir(__builtins__))
# Output: list of all built-in functions like print, len, range, etc.
```

You can use this to explore available functions:
```python
print(len)         # Built-in function
print(ValueError)  # Built-in exception
```

---

## 🔹 `__package__`

### 📖 Purpose:
Indicates the package the module belongs to (used in relative imports).

```python
print(__package__)  # Output: None (if it's not part of a package)
```

---

## 🔹 `__loader__`, `__spec__`, `__cached__`

These are used internally by Python for module loading. They are more relevant in advanced use cases like custom importers or debugging module behavior.

### 💡 Example:
```python
print(__loader__)
print(__spec__)
print(__cached__)
```

---

## ✅ Summary

| Variable        | Use Case                                      |
|-----------------|-----------------------------------------------|
| `__name__`      | Check if file is main or imported             |
| `__file__`      | Get script’s file path                        |
| `__doc__`       | Access documentation of objects               |
| `__builtins__`  | View and access all Python built-ins          |
| `__package__`   | Understand module's package context           |
| `__loader__`    | Internal use: module loading                  |
| `__spec__`      | Internal use: module metadata                 |
| `__cached__`    | Path to compiled bytecode                     |

---

> 📘 Built-in variables are key to understanding Python’s internal behavior and writing smarter code!

