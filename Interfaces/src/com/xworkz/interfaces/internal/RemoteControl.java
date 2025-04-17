package com.xworkz.interfaces.internal;

public interface RemoteControl {

    void powerOn();
    void powerOff();
    void changeChannel();

    default void increaseVolume(){
        System.out.println("Running increaseVolume in REmoteControl");
    }
}
