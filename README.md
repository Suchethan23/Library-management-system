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