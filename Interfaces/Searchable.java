package Interfaces;
import java.util.*;
import LMS.*;


public interface Searchable{
    Book searchById(int id);
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
}