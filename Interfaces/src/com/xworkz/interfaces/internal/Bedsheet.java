package com.xworkz.interfaces.internal;

public interface Bedsheet {

    void spreadSheet();
    void foldSheet();
    void washSheet();

    default void cleanSheet(){
        System.out.println("running cleanSheet in BedSheet");
    }

}
