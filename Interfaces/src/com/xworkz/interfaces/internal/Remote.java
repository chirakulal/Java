package com.xworkz.interfaces.internal;

public interface Remote {

    void turnOnTV();
    void changeChannel();
    void turnOffTV();

    default void increaseVolume(){
        System.out.println("running increaseVolume in Remote");
    }
}
