# 📦 Python Modules: `zipfile` & `shutil`

This documentation covers two essential Python modules used for file management and compression: `zipfile` and `shutil`.

---

## 🗂️ `zipfile` Module

### 📌 Purpose

Used to create, read, extract, and modify ZIP files.

### 📥 Import Module

```python
import zipfile
```

### 📚 Common Functions

#### 1. Create a ZIP File

```python
with zipfile.ZipFile('document.zip', 'w') as zipf:
    zipf.write('file1.txt')
    zipf.write('folder/file2.txt')
```

📝 `'w'` stands for write (create a new ZIP). Use `zipfile.ZIP_DEFLATED` for compression.

#### 2. Read ZIP File Contents

```python
with zipfile.ZipFile('document.zip', 'r') as zipf:
    print(zipf.namelist())
```

📤 Displays the list of files inside the ZIP.

#### 3. Extract All Files

```python
with zipfile.ZipFile('document.zip', 'r') as zipf:
    zipf.extractall('destination_folder')
```

📂 Extracts all files to the destination folder.

#### 4. Extract a Specific File

```python
with zipfile.ZipFile('document.zip', 'r') as zipf:
    zipf.extract('file1.txt', 'destination_folder')
```

📁 Extracts a single file only.

---

## 🔄 `shutil` Module

### 📌 Purpose

Used for high-level file operations like copy, move, delete, and archiving.

### 📥 Import Module

```python
import shutil
```

### 📚 Common Functions

#### 1. Copy a File

```python
shutil.copy('file1.txt', 'destination_folder')
```

📄 Copies a file to the destination folder.

#### 2. Copy a Folder

```python
shutil.copytree('source_folder', 'destination_folder')
```

📁 Copies the entire contents of a folder (including subfolders).

#### 3. Move a File or Folder

```python
shutil.move('file1.txt', 'destination_folder')
```

📦 Moves a file or folder to another location.

#### 4. Delete a Folder

```python
shutil.rmtree('folder_to_delete')
```

🗑️ Deletes the entire folder and its contents.

#### 5. Create an Archive (ZIP, TAR, etc.)

```python
shutil.make_archive('document_archive', 'zip', 'source_folder')
```

📦 Creates an archive from a folder in ZIP format.

---

## 💡 Additional Tips

* Use `with` when opening a ZIP to ensure it's automatically closed.
* `shutil` is great for backup scripts, deployments, or batch file operations.

---

## 🧠 Mini Project Example

Let’s say you want to back up the `project/` folder as a ZIP archive:

```python
import shutil

shutil.make_archive('backup_project', 'zip', 'project')
```

Result: `backup_project.zip` will appear in your directory. 🗃️

---

## 🧾 References

* [zipfile — Python Docs](https://docs.python.org/3/library/zipfile.html)
* [shutil — Python Docs](https://docs.python.org/3/library/shutil.html)

---

🧙‍♀️ *Now Dokja, Jeha, Hamin, and Dazai know how to archive their worlds with Python.* 💼🐍
