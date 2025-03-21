# 📌 Lambda Expressions in Programming

## 🔍 What is a Lambda Expression?
A **lambda expression** is an anonymous function that can have multiple arguments but only one expression. It is commonly used in functional programming and is useful for short, throwaway functions that do not require a full function definition.

### 💡 Key Features:
- **Anonymous:** No need to explicitly define a function name.
- **Concise:** Can be written in a single line.
- **Useful for functional programming:** Commonly used with functions like `map()`, `filter()`, and `reduce()`.
- **Can be assigned to a variable** for later use.

---

## 🎯 Purpose of Lambda Expressions
Lambda expressions provide several advantages in programming:
1. **Code brevity** – Shortens the code by eliminating the need for function definitions.
2. **Improves readability** – Keeps code clean and focused on logic.
3. **Functional programming** – Ideal for operations like mapping, filtering, and reducing collections.
4. **Eliminates the need for temporary functions** – Can be used inline instead of defining a function separately.

---

## 📝 Syntax
```python
lambda arguments: expression
```

### ✅ Explanation:
- `lambda` – Keyword to define a lambda function.
- `arguments` – Input parameters (can be multiple, separated by commas `,`).
- `expression` – A single expression that is evaluated and returned.

🔹 Unlike normal functions, lambda functions **do not use** the `return` keyword; they implicitly return the result of the expression.

---

## 🚀 Examples
### 🏛️ Basic Lambda Function
```python
square = lambda x: x * x
print(square(5))  # Output: 25
```

### 🏛️ Lambda with Multiple Arguments
```python
add = lambda a, b: a + b
print(add(3, 7))  # Output: 10
```

---

## 🔄 Using Lambda Inside Built-in Functions

### 🏛️ Using Lambda Inside `map()`
**Definition:** `map()` applies a function to all items in an iterable (list, tuple, etc.).

#### 📚 Syntax:
```python
map(function, iterable)
```

#### 📝 Example:
```python
numbers = [1, 2, 3, 4, 5]
squared_numbers = list(map(lambda x: x**2, numbers))
print(squared_numbers)  # Output: [1, 4, 9, 16, 25]
```

---

### 🏛️ Using Lambda Inside `filter()`
**Definition:** `filter()` filters elements of an iterable based on a condition.

#### 📚 Syntax:
```python
filter(function, iterable)
```

#### 📝 Example:
```python
numbers = [1, 2, 3, 4, 5, 6]
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)  # Output: [2, 4, 6]
```

---

### 🏛️ Using Lambda Inside `sorted()`
**Definition:** `sorted()` sorts elements in an iterable and allows custom sorting using a key function.

#### 📚 Syntax:
```python
sorted(iterable, key=function, reverse=False)
```

#### 📝 Example:
```python
students = [("Alice", 85), ("Bob", 72), ("Charlie", 90)]
sorted_students = sorted(students, key=lambda x: x[1])
print(sorted_students)
# Output: [('Bob', 72), ('Alice', 85), ('Charlie', 90)]
```

---

### 🏛️ Using Lambda Inside `reduce()`
**Definition:** `reduce()` applies a function cumulatively to the elements of an iterable, reducing it to a single value. (Requires `functools.reduce`.)

#### 📚 Syntax:
```python
reduce(function, iterable)
```

#### 📝 Example:
```python
from functools import reduce
numbers = [1, 2, 3, 4]
product = reduce(lambda x, y: x * y, numbers)
print(product)  # Output: 24
```

---

## 🔥 Lambda Expressions vs Regular Functions
| Feature | Lambda Function | Regular Function |
|---------|---------------|----------------|
| Definition | `lambda args: expression` | `def function_name(args): return expression` |
| Anonymous | ✅ Yes | ❌ No |
| Multi-line | ❌ No | ✅ Yes |
| Readability | ✅ Short and concise | ✅ More readable for complex logic |
| Use Cases | Simple operations, functional programming | Complex logic, multiple statements |

---

## ⚠️ Limitations of Lambda Expressions
- **Only one expression allowed** – Cannot contain multiple statements.
- **Less readable for complex functions** – Regular functions are better for clarity.
- **No docstrings** – Unlike normal functions, lambda functions cannot have docstrings for documentation.

---

## 🏆 When to Use Lambda Expressions?
✅ When you need a short, simple function inline.  
✅ When using functions like `map()`, `filter()`, and `reduce()`.  
✅ When defining quick callbacks in event-driven programming.  
❌ **Avoid** for complex logic – use `def` functions instead!  

---

## 🎯 Summary
- Lambda expressions are **anonymous functions** with a **single expression**.
- They are **useful for short, simple functions**, especially in functional programming.
- Commonly used with **map(), filter(), sorted(), and reduce()**.
- They **should not replace regular functions** when the logic is complex.

🚀 Now you know how to use **lambda expressions** effectively! Happy coding! 💻😃

