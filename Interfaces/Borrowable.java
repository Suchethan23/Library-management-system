package Interfaces;



public interface Borrowable{
    void issueBook(int bookId, int borrowerId);
    void returnBook(int bookId, int borrowerId);
}