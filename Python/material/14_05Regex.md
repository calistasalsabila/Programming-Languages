# 📚 Regex (Regular Expression) Cheatsheet with Python 🐍

Welcome to the complete and beginner-friendly guide to **Regular Expressions (Regex)** in **Python**! 🎉

---

## 📖 What is Regex?

Regex stands for **Regular Expression**. It is a powerful way to **search**, **match**, and **manipulate** text using patterns.

> Think of it as a rulebook you write to describe what you want to find or validate inside a string, like matching emails 📧, filtering usernames 👩‍⚖️, or extracting hashtags 🔖.

---

## 🎯 What is Regex used for?

* ✅ Pattern matching (e.g., find phone numbers)
* ✅ Validation (e.g., validate email or password format)
* ✅ Search and replace (e.g., censoring words)
* ✅ Parsing text (e.g., extract dates or hashtags)
* ✅ Data cleaning and preprocessing (especially in NLP & ML)

---

## 🧪 Basic Regex Syntax

| Symbol  | Description                    | Example     | Matches                                  |       |                |
| ------- | ------------------------------ | ----------- | ---------------------------------------- | ----- | -------------- |
| `.`     | Any character except newline   | `c.t`       | `cat`, `cut`, `c9t`                      |       |                |
| `^`     | Start of string                | `^Hi`       | Matches "Hi there" only at the beginning |       |                |
| `$`     | End of string                  | `end$`      | Matches "the end" only at the end        |       |                |
| `*`     | 0 or more of previous          | `go*d`      | `gd`, `god`, `good`                      |       |                |
| `+`     | 1 or more of previous          | `go+d`      | `god`, `good`                            |       |                |
| `?`     | 0 or 1 of previous             | `colou?r`   | `color`, `colour`                        |       |                |
| `[]`    | Match any one character inside | `[aeiou]`   | `a`, `e`, etc.                           |       |                |
| `[^]`   | Not any character inside       | `[^0-9]`    | Non-digit chars                          |       |                |
| `{n}`   | Exactly n repetitions          | `a{3}`      | `aaa`                                    |       |                |
| `{n,}`  | n or more repetitions          | `a{2,}`     | `aa`, `aaa`, etc.                        |       |                |
| `{n,m}` | Between n and m repetitions    | `a{2,4}`    | `aa`, `aaa`, `aaaa`                      |       |                |
| `\`     | Escape character               | `\.`        | Matches literal `.`                      |       |                |
| \`      | \`                             | OR operator | \`dog                                    | cat\` | `dog` or `cat` |
| `()`    | Grouping & capturing           | `(ab)+`     | `ab`, `abab`, etc.                       |       |                |

---

## 🅤 Character Classes

| Class | Description          | Matches                  |
| ----- | -------------------- | ------------------------ |
| `\d`  | Digit                | `0-9`                    |
| `\D`  | Not a digit          | Anything except `0-9`    |
| `\w`  | Word character       | `a-z`, `A-Z`, `0-9`, `_` |
| `\W`  | Not a word character | Symbols, spaces, etc.    |
| `\s`  | Whitespace           | Space, tab, newline      |
| `\S`  | Not whitespace       | All non-space characters |

### 🌧 Additional Custom Classes

| Class          | Description               | Matches             |
| -------------- | ------------------------- | ------------------- |
| `[A-Z]`        | Uppercase letters         | A, B, ..., Z        |
| `[a-z]`        | Lowercase letters         | a, b, ..., z        |
| `[A-Za-z]`     | All alphabets             | A to Z and a to z   |
| `[0-9]`        | Digits                    | 0 to 9              |
| `[A-Za-z0-9_]` | Alphanumeric + underscore | common in usernames |

---

## 🔏 Quantifiers

Quantifiers determine **how many occurrences of a character or group** you want to match.

| Quantifier | Description                   | Example   | Matches                  |
| ---------- | ----------------------------- | --------- | ------------------------ |
| `*`        | 0 or more of previous element | `lo*l`    | `ll`, `lol`, `loool`     |
| `+`        | 1 or more of previous element | `lo+l`    | `lol`, `loool`           |
| `?`        | 0 or 1 time (optional)        | `colou?r` | `color`, `colour`        |
| `{n}`      | Exactly **n** times           | `a{3}`    | `aaa`                    |
| `{n,}`     | Minimum **n** times           | `a{2,}`   | `aa`, `aaa`, `aaaa`, ... |
| `{n,m}`    | Between **n** and **m** times | `a{2,4}`  | `aa`, `aaa`, `aaaa`      |

### 🔍 Example Usage of Quantifiers

```python
import re

# Match at least 2 digits
re.findall(r"\d{2,}", "Dazai has 7 apples, Hamin has 12, Jeha 345.")
# Output: ['12', '345']

# Match words with exactly 3 letters
re.findall(r"\b\w{3}\b", "Dok Ja is so sly")
# Output: ['Dok', 'sly']
```

---

## 🐍 Python Regex Basics

### ✅ Importing the `re` module

```python
import re
```

### 🔍 Matching a Pattern

```python
pattern = r"cat"
string = "The cat is here."
match = re.search(pattern, string)
if match:
    print("Found!", match.group())
```

### 🔁 Finding All Matches

```python
re.findall(r"\d+", "Calista is 19 and Jeha is 21")
# Output: ['19', '21']
```

### 🔄 Substituting Patterns

```python
re.sub(r"Dokja", "Jeha", "Dokja is awesome!")
# Output: "Jeha is awesome!"
```

### 📦 Compiling Regex for Reuse

```python
pattern = re.compile(r"Jeha")
pattern.findall("Jeha is here. So is Jeha again.")
# Output: ['Jeha', 'Jeha']
```

---

## 💡 Practical Examples with Explanation

### 1. Validate Email

```python
pattern = r"^[\w.-]+@[\w.-]+\.[a-zA-Z]{2,6}$"
re.match(pattern, "dokja99@gmail.com")
```

* `^...$` ensures the whole string matches.
* `[\w.-]+` matches username.
* `@` symbol.
* `[\w.-]+` matches domain.
* `\.` matches dot before TLD.
* `[a-zA-Z]{2,6}` allows TLDs like `.com`, `.org`, `.net`, etc.

### 2. Extract All Hashtags

```python
re.findall(r"#\w+", "Let's go #travel with #Dokja and #Jeha!")
# Output: ['#travel', '#Dokja', '#Jeha']
```

### 3. Validate Indonesian Phone Number

```python
pattern = r"^(\+62|08)[0-9]{8,13}$"
re.match(pattern, "+628123456789")
# Output: match object
```

### 4. Strong Password Rule

```python
pattern = r"^(?=.*[A-Z])(?=.*\d).{8,}$"
re.match(pattern, "Secure123")
# ✅ At least 1 uppercase and 1 digit, min length 8
```

### 5. Match HTML Tags

```python
re.findall(r"<\/?\w+>", "<p>Hello</p><div>World</div>")
# Output: ['<p>', '</p>', '<div>', '</div>']
```

### 6. ✅ Positive Lookahead: Must contain certain pattern

```python
pattern = r"^(?=.*[A-Z])(?=.*\d).+$"
re.match(pattern, "A1b2c3")  # Valid: has uppercase & digit
```

### 7. ❌ Negative Lookahead: Must NOT contain pattern

```python
pattern = r"^(?!.*badword).+$"
re.match(pattern, "clean content")  # Valid: no badword
```

---

## ⚠️ Common Mistakes in Regex

* ❌ Forgetting to escape special characters: `\.` instead of `.`
* ❌ Using greedy quantifiers without control
* ❌ Forgetting to use raw strings in Python: `r"pattern"`
* ❌ Misusing character classes (e.g., `[^a-z]` = NOT lowercase)

---

## 🤔 Tips to Master Regex

* 👀 Use **regex101.com** to test and understand patterns interactively.
* 🔬 Break complex patterns into small chunks.
* 🧹 Practice real problems like email, password, hashtags, HTML extraction.
* 🧪 Test with both positive & negative examples.

---

## ✨ Final Thoughts

Regex is an indispensable tool for string processing, text analysis, data validation, and more. Mastering it empowers you to clean, extract, and transform data efficiently — a must-have skill for developers and data scientists alike.

---

Feel free to ask if you need further assistance or examples! 🔍✨
