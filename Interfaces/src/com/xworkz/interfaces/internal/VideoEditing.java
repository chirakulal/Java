package com.xworkz.interfaces.internal;

public interface VideoEditing {

    void cutClip();
    void addTransition();
    void exportVideo();

    default void edit(){
        System.out.println("Running edit in VideoRditing");
    }
}
