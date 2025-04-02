# 📚 Book Management System

This project is a simple Python-based book management system that allows users to add, display, and remove books from different genres. The genres available are **Fiction** and **Non-Fiction**.

## 🚀 Features
- Add books to a genre.
- Display books in a selected genre.
- Remove books from a selected genre.

## 🛠️ How It Works

1. The user selects a genre (**Fiction** or **Non-Fiction**).
2. The user chooses an action from the menu:
   - **Display books** 📖
   - **Add a book** ➕
   - **Remove a book** ❌
   - **Exit the program** 🔚
3. The program performs the chosen action.

## 📝 Code Explanation

### 📌 Class: `Book`
```python
class Book:
    def __init__(self):
        self.book = []
```
- Initializes an empty list `book` to store book details.

### 📌 Method: `display_book()`
```python
    def display_book(self):
        if self.book:
            for num, item in enumerate(self.book, start=1):
                print(f"{num}. {item['title']}, the author is {item['author']}")
        else:
            print("No book to display")
            return 1
```
- Displays the list of books with their titles and authors.
- Returns `1` if no books are available.

### 📌 Method: `add_book()`
```python
    def add_book(self):
        title = input("Enter the book title: ")
        author = input("Enter the book author: ")
        self.book.append({"title": title, "author": author})
        print(f'{title} successfully added')
```
- Takes user input for book title and author.
- Adds the book to the list.

### 📌 Method: `remove_book()`
```python
    def remove_book(self):
        if self.display_book() == 1:
            print("No book to remove")
            return

        num = input("Enter the number of the book you want to remove: ")

        if not num.isdigit():
            print("Invalid input! Please enter a valid number.")
            return

        num = int(num)  

        if num < 1 or num > len(self.book):
            print("Invalid number! Please enter a valid book number.")
            return

        del self.book[num - 1]
        print(f"Book {num} removed")
```
- Checks if books are available before allowing removal.
- Takes user input for the book number and removes it from the list if valid.

### 📌 Function: `choose_genre()`
```python
def choose_genre():
    print("Choose genre : ")
    print("1. Non-Fiction")
    print("2. Fiction")
    choosen = int(input("Enter your choice : "))
    if choosen == 1:
        return non_fiction
    elif choosen == 2:
        return fiction
    else:
        print("Invalid choice")
        return choose_genre()
```
- Allows users to choose between Fiction and Non-Fiction genres.

### 📌 Main Menu Loop
```python
while True:
    print("\nMenu")
    print("1. Display book")
    print("2. Add book")
    print("3. Remove book")
    print("4. Exit")

    chose = input("Enter number (1-4) : ")
    if chose in ['1', '2', '3']:
        book = choose_genre()
        if book:
            if chose == '1':
                book.display_book()
            elif chose == '2':
                book.add_book()
            elif chose == '3':
                book.remove_book()
    elif chose == '4':
        break
    else:
        print("Invalid choice! Try again.")
```
- Displays the menu and processes user input.
- Calls `choose_genre()` before performing actions.

## 🏁 How to Run
1. Copy the script into a Python file (e.g., `book_management.py`).
2. Run the script:
   ```bash
   python book_management.py
   ```
3. Follow the on-screen prompts to manage books.

## 📌 Example Usage
```plaintext
Menu
1. Display book
2. Add book
3. Remove book
4. Exit
Enter number (1-4) : 2
Choose genre :
1. Non-Fiction
2. Fiction
Enter your choice : 1
Enter the book title: Harry Potter
Enter the book author: Jk Rowling
The Art of War successfully added
```

## 🔥 Future Enhancements
- Save book data to a file for persistence.
- Add categories for better organization.
- Implement a search feature to find books easily.

---
💡 **This project is a great way to practice working with lists, user input, and basic object-oriented programming in Python!** 🚀

