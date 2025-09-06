package LMS;

import Abstracts.Person;
import java.util.*;



public class Borrower extends Person {
    private String contact;
    protected List<Book> borrowedBooks = new ArrayList<>();

    public Borrower(int id, String name, String contact) {
        super(id, name);
        this.contact = contact;
    }

    public String getContact() { return contact; }

    @Override
    public void displayInfo() {
        System.out.println("Borrower: " + name + " (ID: " + id + "), Contact: " + contact);
    }
}