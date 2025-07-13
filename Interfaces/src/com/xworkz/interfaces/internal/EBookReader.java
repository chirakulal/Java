package com.xworkz.interfaces.internal;

public interface EBookReader {

    void openBook();
    void bookmarkPage();
    void closeBook();

    default void read(){
        System.out.println("Running read in EBookReader");
    }

}
