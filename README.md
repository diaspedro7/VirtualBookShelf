# Java VirtualBookShelf
### Manage your personal reading list directly from the console

---
### What is this project?

VirtualBookShelf is a simple Java console application that helps you organize your books.
It follows the MVC pattern, stores your data in a CSV file, and lets you interact through a straightforward text-based menu.

It follows the MVC structure, with:

Model (Book) → represents each book with title, author, and reading status.

Controller (BookShelfController) → manages the book list and handles persistence in CSV.

View (BookShelfView) → console interface to add books, list them, and exit the program.

---
The program automatically saves your books into bookList.csv and loads them at startup, so your list is always preserved between runs.

---
### How it Works

The program runs directly in the terminal and shows a simple menu:

1 - View book list  
2 - Add a new book  
3 - Exit program


Every book you add is saved in bookList.csv and automatically reloaded when you run the app again.