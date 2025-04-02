class Book:
    def __init__(self):
        self.book = []

    def display_book(self):
        if self.book:
            for num, item in enumerate(self.book, start=1):
                print(f"{num}. {item['title']}, the author is {item['author']}")
        else:
            print("No book to display")
            return 1
    
    def add_book(self):
        title = input("Enter the book title: ")
        author = input("Enter the book author: ")
        self.book.append({"title": title, "author": author})
        print(f'{title} successfully added')

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


non_fiction = Book()
fiction = Book()

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
