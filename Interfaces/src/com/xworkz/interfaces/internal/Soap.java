package com.xworkz.interfaces.internal;

public interface Soap {

    void applySoap();
    void rinseSoap();
    void drySkin();

    default void clean(){
        System.out.println("Running clean in Soap");
    }
}
