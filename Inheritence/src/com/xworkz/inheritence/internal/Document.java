package com.xworkz.inheritence.internal;

public class Document {
    public Document() {
        System.out.println("No-arg constructor is running in Document");
    }

    public void open() { System.out.println("Opening the document"); }

    public void read() { System.out.println("Reading the document"); }

    public void write() { System.out.println("Writing on the document"); }

    public void save() { System.out.println("Saving the document"); }

    public void print() { System.out.println("Printing the document"); }
}
