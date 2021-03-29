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
        return "ReadingList{" +
                "moduleCode='" + moduleCode + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
