package com.xworkz.interfaces.internal;

public interface Television {
    void turnOn();
    void changeChannel();
    void turnOff();
    default  void  volume(){
        System.out.println("Running volume in Television");
    }
}
