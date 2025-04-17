package com.xworkz.interfaces.internal;

public interface NoteTaking {

    void writeNote();
    void deleteNote();
    void highlightText();

    default void editNoter(){
        System.out.println("Running editNote in NoteTaking");
    }
}
