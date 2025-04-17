package com.xworkz.interfaces.internal;

public interface Calculator {

    void add();
    void subtract();
    void multiply();

    default void division(){
        System.out.println("Running division in Calculator");
    }
}
