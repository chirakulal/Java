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
        System.out.println("Parent : " + super.hashCode());
        return 47;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Books) {
                Books books1 = this;
                Books books2 = (Books) obj;
                if (books1.title.equals(books2.title) &&
                        books1.author.equals(books2.author)) {
                    System.out.println("Both books are same based on title and author");
                    return true;
                }
            }
        }
        return false;
    }
}
