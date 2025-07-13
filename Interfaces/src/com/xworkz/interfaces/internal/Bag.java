package com.xworkz.interfaces.internal;

public interface Bag {

    void openBag();
    void closeBag();
    void carryBag();
    default void checkBag(){
        System.out.println("Running checkBag in Bag");
    }
}
