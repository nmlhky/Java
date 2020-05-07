package day55Sorting;

import java.util.Collection;
import java.util.Comparator;

public class BookTitleSort implements Comparator<Book> {
    public int compare(Book b1, Book b2){
        return b1.getTitle().compareTo(b2.getTitle());
    }
}