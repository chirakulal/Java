package com.xworkz.interfaces.internal;

public interface Browser {

    void openTab();
    void closeTab();
    void refreshPage();
    default void search(){
        System.out.println("Running search in Browser");
    }
}
