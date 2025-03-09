# 📌 Study Case: To-Do List (Java)

## 📖 Introduction
This project is a simple **To-Do List application** built using Java. The application allows users to **add**, **remove**, **view**, and **clear** their tasks efficiently. The implementation follows a structured approach to enhance **code readability** and **scalability**.

## 🎯 Features
✅ View To-Do List  
✅ Add a new task  
✅ Remove a specific task  
✅ Remove all tasks at once  
✅ Dynamic array resizing when full  
✅ Interactive user interface via console  

## 🛠️ Installation & Usage
### 🔹 Prerequisites
- Ensure you have **Java (JDK 8 or later)** installed.
- A Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) or terminal with Java.

### 🔹 How to Run
1. **Clone or Download** the project.
2. Open the project in your preferred IDE.
3. Compile and run the `studycasetodolist.java` file.
4. Interact with the console-based menu.

## 🚀 How It Works
### 📝 To-Do List Operations
- The **to-do list** is stored in an array (`model`), initialized with a capacity of **10**.
- If the list is **full**, it dynamically expands its capacity.
- Users interact with the list through a **console-based menu**.

### 🏗️ Code Structure
| File | Description |
|------|-------------|
| `studycasetodoList.java` | Main application file, handles all to-do operations. |

### 📌 Key Methods
| Method | Description |
|--------|-------------|
| `showTodoList()` | Displays the current list. |
| `addTodoList(String todo)` | Adds a new task, resizes array if needed. |
| `removeTodoList(int number)` | Removes a task based on number. |
| `removeAllTodoList()` | Clears all tasks from the list. |
| `input(String info)` | Gets user input via scanner. |
| `viewShowTodoList()` | Displays the menu and handles user actions. |
| `viewAddTodoList()` | Manages task addition interface. |
| `viewRemoveTodoList()` | Handles task removal interface. |
| `viewRemoveAllTodoList()` | Manages bulk task deletion. |

## 📸 Preview
```sh
TO-DO LIST
1. Buy groceries
2. Complete Java project
Menu:
1. Add
2. Remove
3. Exit
4. Remove All
Choose: _
```

## 💡 Future Improvements
- 🖥️ Add a GUI using Java Swing or JavaFX.
- 💾 Implement file-based storage (e.g., saving tasks to a text file).
- 📱 Convert to a mobile app using Android.

## 🏆 Contributing
Want to enhance this project? Feel free to **fork, modify, and contribute**! 🚀

---
🛠️ *Developed with Java | Happy Coding!* 😃

