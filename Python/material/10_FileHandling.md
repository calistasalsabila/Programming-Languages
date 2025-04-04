# 📂 File Handling in Python

Python provides built-in functions to work with files. File handling allows us to **create, read, write, and delete** files — which is essential for storing data persistently.

---

## 🧠 Why is File Handling Important?

File handling enables programs to:
- Save output or logs 📃  
- Read large datasets 📊  
- Process text, config, or user data 🖠️  
- Build data pipelines for ML & apps 💻  

---

## 📄 File Modes in Python

| Mode | Description |
|------|-------------|
| `'r'` | Read (default). Error if file doesn't exist. |
| `'w'` | Write. Creates new file or overwrites existing one. |
| `'a'` | Append. Creates file if it doesn't exist, adds to the end. |
| `'x'` | Create. Fails if the file already exists. |
| `'b'` | Binary mode (e.g., `'rb'`, `'wb'`) |
| `'t'` | Text mode (default). Usually combined with `'r'`, `'w'` |

---

## ✨ Basic Syntax

```python
file = open("filename.txt", "mode")
# Do file operations...
file.close()
```

Always **close** the file after using it to avoid memory leaks.

---

## 📅 Reading a File

### 🧒 Example 1: Basic Read

```python
file = open("dokja_notes.txt", "r")
content = file.read()
print(content)
file.close()
```

**Output:**
```
Dokja: The world is cruel but I have a plan.
```

### 🧒 Example 2: Read Line by Line

```python
file = open("jeha_todo.txt", "r")
for line in file:
    print(line.strip())
file.close()
```

**Output:**
```
1. Finish code
2. Send to Dokja
3. Sleep
```

---

## ✍️ Writing to a File

### ✊ Example 1: Overwrite Content (`w` mode)

```python
file = open("hamin_diary.txt", "w")
file.write("Today I met Dokja and it was weird.")
file.close()
```

**Effect:** Replaces all content in the file.

### ✊ Example 2: Append Content (`a` mode)

```python
file = open("hamin_diary.txt", "a")
file.write("\nI think Jeha knows something...")
file.close()
```

**Effect:** Adds text at the end without removing previous content.

---

## ⚖️ Using `with` Statement (Best Practice)

```python
with open("dazai_poem.txt", "r") as file:
    print(file.read())
```

This automatically closes the file after exiting the block. Recommended for clean and safe file operations.

---

## ❌ Deleting a File

You can use the `os` module:

```python
import os

if os.path.exists("old_file.txt"):
    os.remove("old_file.txt")
else:
    print("The file does not exist")
```

---

## ✨ Extra: Check if File Exists

```python
import os
print(os.path.exists("dokja_notes.txt"))
```

**Output:**
```
True or False
```

---

## 📈 Summary

- Use `open()` to work with files.
- Modes: `'r'`, `'w'`, `'a'`, `'x'`, `'b'`, `'t'`
- Always close the file (or use `with`).
- Use `os` module for checking and deleting files.

---

Happy coding 🚀📝

