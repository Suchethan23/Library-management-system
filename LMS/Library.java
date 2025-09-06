package LMS;

import Interfaces.*;
import java.util.*;

public class Library implements Searchable, Borrowable {
    private List<Book> books = new ArrayList<>();
    private List<Borrower> borrowers = new ArrayList<>();

    // Book management
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void removeBook(int bookId) {
        Book book = searchById(bookId);
        if (book != null && book.isAvailable()) {
            books.remove(book);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book cannot be removed (either not found or already issued).");
        }
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach(System.out::println);
        }
    }

    // Borrower management
    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
        System.out.println("Borrower added successfully!");
    }

    public void showAllBorrowers() {
        if (borrowers.isEmpty()) {
            System.out.println("No borrowers available.");
        } else {
            borrowers.forEach(Borrower::displayInfo);
        }
    }

    // ==================== IMPLEMENT INTERFACES ====================

    // Searchable
    @Override
    public Book searchById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    // Borrowable
    @Override
    public void issueBook(int bookId, int borrowerId) {
        Book book = searchById(bookId);
        if (book != null && book.isAvailable()) {
            for (Borrower br : borrowers) {
                if (br.getId() == borrowerId) {
                    book.setAvailable(false);
                    br.borrowedBooks.add(book);
                    System.out.println("Book issued to " + br.getName());
                    return;
                }
            }
            System.out.println("Borrower not found!");
        } else {
            System.out.println("Book not available!");
        }
    }

    @Override
    public void returnBook(int bookId, int borrowerId) {
        Book book = searchById(bookId);
        if (book != null && !book.isAvailable()) {
            for (Borrower br : borrowers) {
                if (br.getId() == borrowerId && br.borrowedBooks.remove(book)) {
                    book.setAvailable(true);
                    System.out.println("Book returned by " + br.getName());
                    return;
                }
            }
            System.out.println("Borrower not found or book not borrowed!");
        } else {
            System.out.println("Invalid return operation!");
        }
    }
}