package javaClassWithMrDuran.day36UML;

import java.util.Date;


public abstract class Document {
    private String[] authors;
    private Date date;

    public Document(String[] authors, Date date) {
        this.authors = authors;
        this.date = date;
    }

    public String[] getAuthors() {
        return authors;
    }

    public Date getDate() {
        return date;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
