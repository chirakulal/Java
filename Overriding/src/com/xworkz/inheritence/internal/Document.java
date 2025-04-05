package com.xworkz.inheritence.internal;

public class Document {
    public Document() {
        System.out.println("No-arg constructor is running in Document");
    }

    public void open() {
        System.out.println("Running open in Document");
    }

    public void read() {
        System.out.println("Running read in Document");
    }

    public void write() {
        System.out.println("Running write in Document");
    }

    public void save() {
        System.out.println("Running save in Document");
    }

    public void print() {
        System.out.println("Running print in Document");
    }

}
