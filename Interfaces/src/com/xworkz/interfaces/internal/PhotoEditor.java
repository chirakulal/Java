package com.xworkz.interfaces.internal;

public interface PhotoEditor {

    void crop();
    void filter();
    void save();

    default void delete(){
        System.out.println("Running delete in PhotoEditor");
    }
}
