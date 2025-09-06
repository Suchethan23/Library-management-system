import java.io.*;
import java.lang.*;
import java.util.*;
import LMS.*;
import Interfaces.*;
import Abstracts.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Show All Books");
            System.out.println("4. Add Borrower");
            System.out.println("5. Show All Borrowers");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                }
                case 2 -> {
                    System.out.print("Enter Book ID to remove: ");
                    int id = sc.nextInt();
                    library.removeBook(id);
                }
                case 3 -> library.showAllBooks();
                case 4 -> {
                    System.out.print("Enter Borrower ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Borrower Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();
                    library.addBorrower(new Borrower(id, name, contact));
                }
                case 5 -> library.showAllBorrowers();
                case 6 -> {
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Borrower ID: ");
                    int borrowerId = sc.nextInt();
                    library.issueBook(bookId, borrowerId);
                }
                case 7 -> {
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter Borrower ID: ");
                    int borrowerId = sc.nextInt();
                    library.returnBook(bookId, borrowerId);
                }
                case 8 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}