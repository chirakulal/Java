package com.xworkz.interfaces.internal;

public interface WashingMachine {

    void wash();
    void rinse();
    void dry();

    default void clean(){
        System.out.println("Running clean in washingMachine");
    }
}
