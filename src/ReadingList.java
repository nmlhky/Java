import java.util.Arrays;

public class ReadingList {
    String moduleCode;
    Book[] books;

    public ReadingList(String moduleCode, Book[] books) {
        this.moduleCode = moduleCode;
        this.books = books;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String result = "";

        for (Book b : books) {
            result += b.toString() + "\n";
        }

        return moduleCode + ":\n" + result;
    }
}
