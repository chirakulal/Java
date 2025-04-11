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
                        ", numPages=" + numPages;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 11;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Novel) {
                Novel n1 = this;
                Novel n2 = (Novel) obj;
                if (n1.title.equals(n2.title) &&
                        n1.author.equals(n2.author) &&
                        n1.numPages == n2.numPages) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
