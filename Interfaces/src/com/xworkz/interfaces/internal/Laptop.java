package com.xworkz.interfaces.internal;

public interface Laptop {

    void boot();
    void sleep();
    void shutdown();

    default void restart(){
        System.out.println("Running restart in Laptop");
    }
}
