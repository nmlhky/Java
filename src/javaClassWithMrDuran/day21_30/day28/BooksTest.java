package javaClassWithMrDuran.day21_30.day28;

public class BooksTest {
    public static void main(String[] args) {
        Books myBook = new Books("War and Peace", "Tolstoy", "01242342", 1200, true, "", "");
        System.out.println(myBook.toString());
        myBook.borrowBook("3/18/2020");
        System.out.println(myBook.getBarrowDate());
        System.out.println(myBook.isAvailable());
        myBook.borrowBook("3/18/2020");
        myBook.returnBook("3/20/2020");
        System.out.println(myBook.isAvailable());
    }
}