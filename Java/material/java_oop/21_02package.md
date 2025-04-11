# 📦 Java Package

When building a Java application, we often end up creating many classes. To avoid difficulties in locating or categorizing those classes, Java provides the **package** feature.

## 🗂️ What is a Package?
A package in Java is similar to a folder or directory. With packages, we can group related classes together based on their functionality.

Analogy:
> Package = Folder,
> Class = File inside that folder.

## 🎯 Purpose of Using Packages
- Organize classes to avoid clutter.
- Make it easier to find and maintain code.
- Prevent class name conflicts in different contexts.

## 🧩 Nested Packages
Just like folders can have subfolders, packages can also be **nested**. We use a dot (`.`) to define a nested package.

Example:
```java
package com.dokja.utils;
```
This means the class is stored inside the folder:
```
com/dokja/utils/
```

## 📌 Package Declaration Rule
When saving a class inside a package, you **must declare the package name at the very top** of the Java file.

Example:
```java
package com.dokja.utils;

public class ScannerLite {
    // code here
}
```

## 💡 Tips
- Package names are recommended to be all lowercase.
- Use a structure that reflects the organization or project (e.g., `com.appname.feature`).
- Save Java files in folders that match the package structure.

---

📚 *By understanding packages, we can build cleaner, more maintainable, and scalable Java projects!*

Happy coding! 🚀