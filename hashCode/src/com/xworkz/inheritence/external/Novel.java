package com.xworkz.inheritence.external;

public class Novel {

    private String title;
    private String author;
    private int numPages;

    // Constructor
    public Novel(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages ;
    }

    @Override
    public int hashCode() {
        return 11;
    }
}
