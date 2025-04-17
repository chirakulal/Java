package com.xworkz.interfaces.internal;

public interface MapApp {

    void locatePlace();
    void measureDistance();
    void saveLocation();

    default void search(){
        System.out.println("Running search in MapApp");
    }
}
