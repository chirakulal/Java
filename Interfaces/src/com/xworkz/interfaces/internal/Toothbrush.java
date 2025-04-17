package com.xworkz.interfaces.internal;

public interface Toothbrush {

    void applyToothpaste();
    void brushTeeth();
    void rinseMouth();

    default void flavour(){
        System.out.println("Running flavour in TOothPaste");
    }
}
