# 📚 Library Management System (Java, Console-based)

A simple **Library Management System** built in **Core Java** using **OOP principles, Abstract Classes, and Interfaces**.  
This project is designed to practice **Java fundamentals**, **package organization**, and **console interaction**.

---

## ✨ Features
- Add and remove books from the library  
- Search books by:
  - ID  
  - Title  
  - Author  
- Track book availability (issued/returned)  
- Manage borrowers:
  - Add borrowers  
  - Show borrower list  
  - Track borrowed books  
- Issue and return books  
- Menu-driven **console-based UI**  

---

## 🛠️ Tech Stack
- **Language**: Java 17+ (Core Java)  
- **Concepts Used**:
  - Abstract classes  
  - Interfaces  
  - Packages & Imports  
  - Collections (`ArrayList`)  
  - Streams API (for search/filter)  
  - Object-Oriented Programming (Encapsulation, Abstraction, Polymorphism)

---

## 📂 Project Structure
LibraryManagementSystem/
│
├── Abstracts/
│ └── Person.java # Abstract class for common person fields
│
├── Interfaces/
│ ├── Searchable.java # Interface for book search operations
│ └── Borrowable.java # Interface for issue/return operations
│
├── LMS/
│ ├── Book.java # Book entity
│ ├── Borrower.java # Borrower entity (extends Person)
│ ├── Library.java # Main logic (implements interfaces)
│ └── LibraryManagementSystem.java # Main program (menu-driven)
│
└── README.md




---

## ▶️ How to Run

1. **Clone the repo**
   ```sh
   git clone https://github.com/your-username/LibraryManagementSystem.git
   cd LibraryManagementSystem


2. Run from the project root where Abstracts/, Interfaces/, and LMS/ folders exist
   javac *.java
   java LibraryManagementSystem


# Example console flow
=== Library Menu ===
1. Add Book
2. Remove Book
3. Show All Books
4. Add Borrower
5. Show All Borrowers
6. Issue Book
7. Return Book
8. Exit
Enter choice: 1

Enter Book ID: 101
Enter Book Title: Java Basics
Enter Book Author: James Gosling
Book added successfully!

