package com.xworkz.interfaces.internal;

public interface Printer {
    void print();
    void scan();
    void copy();

    default void edit(){
        System.out.println("running edit in printer");
    }
}
