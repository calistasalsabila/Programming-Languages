# 🐬 Dart Project Folder Structure

 This file explains how the folder structure works in my Dart projects, especially regarding the locations of the actual code files.

## 📁 Main Code Folders

In Dart projects created using `dart create`, you will typically see a number of folders. The two most important ones where actual Dart code lives are:

### 1. `lib/`

* This folder contains the main library code for your Dart project.
* If you're building a package or module, this is where your reusable code goes.
* You can structure it with subfolders like `src/`, `utils/`, etc.

> Example:

```bash
/lib
  └── my_library.dart
```

### 2. `bin/`

* This is the folder for executable Dart files (entry points).
* If you're creating command-line apps or running quick test files, they go here.
* You can have multiple Dart files inside this folder.

> Example:

```bash
/bin
  ├── main.dart
  └── test_run.dart
```

## ℹ️ Why Explain This?

Because when you open the project, you might see other folders like `.dart_tool/`, `test/`, or even `build/`. But only `lib/` and `bin/` contain the actual code I wrote. The rest are either auto-generated or for config/testing.

So if you're browsing my GitHub repo and wondering, "Where's the Dart code?" 👉 check `lib/` and `bin/`!

## ✅ TL;DR

* `lib/`: for the main logic/library files
* `bin/`: for executables and main Dart scripts
* Other folders: auto-generated or for tooling (you can ignore them unless you're contributing)

---

Happy hacking with Dart 🐬!
