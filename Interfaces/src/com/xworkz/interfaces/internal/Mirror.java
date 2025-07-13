package com.xworkz.interfaces.internal;

public interface Mirror {

    void lookInto();
    void cleanMirror();
    void adjustAngle();

    default void keep(){
        System.out.println("running keep in Mirror");
    }
}
