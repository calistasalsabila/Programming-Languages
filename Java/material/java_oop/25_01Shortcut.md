# Java: Auto-Generate Getter and Setter in VS Code

## 🎯 Purpose

This guide helps Java learners understand how to **auto-generate getters and setters** in Visual Studio Code, similar to full-featured IDEs like IntelliJ IDEA or NetBeans. This method is efficient, avoids repetitive code, and supports clean object-oriented programming.

---

## 🧠 Theory Explanation

In Java, variables are often declared `private` to follow the principle of **Encapsulation**. To access and modify these private variables, we use:

* **Getter methods** to retrieve values.
* **Setter methods** to modify values.

### ✍️ Example:

```java
private String name;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

Manually writing these methods for every field can be tedious and error-prone. VS Code provides an efficient way to generate them automatically.

---

## 🛠️ Steps to Enable Getter/Setter Generation in VS Code

### ✅ Step 1: Install Java Extension Pack

Install "Java Extension Pack" to enable language features for Java in VS Code:

* Open VS Code
* Go to Extensions: `Ctrl + Shift + X`
* Search: `Java Extension Pack` by Microsoft
* Click **Install** (includes language support, debugger, and tools)

🔗 [Java Extension Pack – VS Code Marketplace](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

---

### ✅ Step 2: Create a Java Class

```java
public class Mahasiswa {
    private String nama;
    private int umur;
}
```

---

### ✅ Step 3: Generate Getter and Setter Automatically

1. Right-click anywhere inside the class body.
2. Select `Source Action...`
3. Click on `Generate Getters and Setters`
4. Choose the fields you want to generate them for

VS Code will insert the following:

```java
public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public int getUmur() {
    return umur;
}

public void setUmur(int umur) {
    this.umur = umur;
}
```

---

## 📦 Bonus Tips

* If you want something more powerful, consider using **Project Lombok** to auto-generate getters/setters with annotations like `@Getter` and `@Setter`.
* You can also generate `constructor`, `equals()`, and `hashCode()` with similar steps via **Source Action**.

---

## 🧾 Summary

| Feature               | Available in VS Code      |
| --------------------- | ------------------------- |
| Auto Getter/Setter    | ✅ Yes (via Source Action) |
| Requires Extension    | ✅ Java Extension Pack     |
| Manual typing needed? | ❌ No                      |
| Shortcut available?   | 🔧 Only via context menu  |

---

## 🔚 Conclusion

With the right extensions, VS Code can function like a lightweight Java IDE. By generating boilerplate code like getters and setters, you can focus more on logic and architecture — not syntax repetition.

Use tools smartly, code cleanly, and make Dokja, Jeha, Hamin, and Dazai proud developers! 💻✨
