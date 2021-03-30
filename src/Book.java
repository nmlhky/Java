import java.util.Random;

public class Book {
    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public static String getAuthor() {
        return "author";
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) by %s", title, year, author);
    }


}
