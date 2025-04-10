package com.xworkz.inheritence.external;


public class Books {
    private String title;
    private String author;
    private int pageCount;


    public Books(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount;
    }

    @Override
    public int hashCode() {
        return 47;
    }
}
