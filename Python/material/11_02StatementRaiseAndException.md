# 🚨 Raise and Custom Exceptions in Python

Handling built-in exceptions is great—but sometimes, we need to manually trigger an error using the `raise` keyword or even create our own exception types! 🔥

---

## 📌 What is `raise` in Python?

The `raise` statement is used to **trigger an exception manually**. You can use it with built-in exceptions or your own custom ones.

### 📎 Syntax:

```python
raise ExceptionType("Optional error message")
```

---

## 🔥 Using `raise` with Built-in Exceptions

### 👀 Example:

```python
def divide(x, y):
    if y == 0:
        raise ZeroDivisionError("You can't divide by zero!")
    return x / y

try:
    print(divide(10, 0))
except ZeroDivisionError as e:
    print("❌", e)
```

### 🧾 Output:

```
❌ You can't divide by zero!
```

---

## 🧰 Creating Custom Exceptions

Sometimes built-in exceptions aren’t enough. You can define your own by **subclassing `Exception`**.

### 📎 Syntax:

```python
class MyCustomError(Exception):
    pass
```

---

## 👷 Raise a Custom Exception

### 👀 Example:

```python
class UnderAgeError(Exception):
    def __init__(self, age):
        super().__init__(f"Age {age} is too young to register.")


def register(age):
    if age < 18:
        raise UnderAgeError(age)
    print("✅ Registered successfully!")

try:
    register(16)  # Hamin tries to register
except UnderAgeError as e:
    print("🚫", e)
```

### 🧾 Output:

```
🚫 Age 16 is too young to register.
```

---

## 🔍 Why use parentheses `()` in `super().__init__()`?

When calling `super().__init__(self.message)` or `super().__init__(message=self.message)`, you're passing the error message to the parent `Exception` class.

### ✅ Correct Examples:

```python
super().__init__("This is an error")              # Positional
super().__init__(message="This is an error")     # Keyword (less common for Exception)
```

In most cases, **positional arguments** are used because the `Exception` class is built to accept the message as the first argument. So this is totally valid:

```python
super().__init__(self.message)
```

### 📎 Why not use just `self.message`?
Because `self.message` only assigns the message to an attribute. To actually **raise an error** with a message, it needs to be passed to the base class using `super().__init__()`.

### 🔍 Bonus Insight: `()` vs No `()` in Python

- When you write `ClassName` without parentheses, you're just **referencing the class itself**, not calling or instantiating it.
- When you write `ClassName()` **with parentheses**, you're creating an **instance** of that class.

📌 **Example:**

```python
class MyClass:
    def __init__(self):
        print("Instance created")

print(MyClass)    # <class '__main__.MyClass'> (just a reference)
print(MyClass())  # Instance created + returns the instance
```

So when you do:
```python
raise MyError  # just referring to class — ❌ won't work properly
raise MyError()  # instantiates and raises the exception — ✅ correct
```

---

## 📌 Why Use Custom Exceptions?

✅ Make errors easier to understand.  
✅ Better debugging and clarity.  
✅ More control over app logic and flow.

---

## 🧠 Summary

- Use `raise` to trigger errors intentionally.  
- You can raise both built-in and custom exceptions.  
- Create custom exceptions by subclassing `Exception`.  
- Use parentheses `()` in `super().__init__()` to pass messages correctly.  
- `()` is used to instantiate classes — without it, you're just referencing the class.  
- Custom exceptions = clean, readable, maintainable code. ✨

