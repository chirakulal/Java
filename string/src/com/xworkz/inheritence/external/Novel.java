package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Book;

public class Novel extends Book {

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
    public void read(){
        System.out.println("Running read in Novel");
    }
    @Override
    public void write(){
        System.out.println("Running write in Novel");
    }
    @Override
    public void publish(){
        System.out.println("Running publish in Novel");
    }
    @Override
    public void edit(){
        System.out.println("Running edit in Novel");
    }
    @Override
    public void rewrite(){
        System.out.println("Running rewrite in Novel");
    }
    public void sell(){
        System.out.println("Running sell in Novel");
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages ;
    }
}
