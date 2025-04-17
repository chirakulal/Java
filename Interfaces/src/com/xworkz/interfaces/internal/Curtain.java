package com.xworkz.interfaces.internal;

public interface Curtain {


    void openCurtain();
    void closeCurtain();
    void cleanCurtain();

    default void throwCurtain(){
        System.out.println("Running throwCurtain in Curtain");
    }
}
