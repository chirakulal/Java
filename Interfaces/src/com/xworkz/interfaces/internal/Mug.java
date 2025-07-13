package com.xworkz.interfaces.internal;

public interface Mug {


    void fillMug();
    void emptyMug();
    void cleanMug();

    default void storeMug() {
        System.out.println("Running storeMug in Mug");
    }
}
