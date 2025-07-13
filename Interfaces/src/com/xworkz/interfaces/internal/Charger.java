package com.xworkz.interfaces.internal;

public interface Charger {

    void plugIn();
    void chargeDevice();
    void unplug();

    default void KeepitSafe(){
        System.out.println("running keepitSafe in Charger");
    }
}
