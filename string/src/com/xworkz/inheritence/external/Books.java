package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Document;
import com.xworkz.inheritence.internal.Soap;

public class Books extends Document {
    private String title;
    private String author;
    private int pageCount;


    public Books(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    @Override
    public void open() {
        System.out.println("Running open in Books");
    }

    @Override
    public void read() {
        System.out.println("Running read in Books");
    }

    @Override
    public void write() {
        System.out.println("Running write in Books");
    }

    @Override
    public void save() {
        System.out.println("Running save in Books");
    }

    @Override
    public void print() {
        System.out.println("Running print in Books");
    }

    public void edit(){
        System.out.println("Running edit in Book");
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount;
    }
}
