package com.xworkz.interfaces.internal;

public interface SmartDevice {

    void connect();
    void disconnect();
    void update();

    default void themeChange(){
        System.out.println("Running themeChnage in SmartDevice");
    }
}
