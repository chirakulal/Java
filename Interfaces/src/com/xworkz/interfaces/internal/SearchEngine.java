package com.xworkz.interfaces.internal;

public interface SearchEngine {

    void searchQuery();
    void displayResults();
    void filterResults();

    default void result(){
        System.out.println("Running default in result");
    }
}
