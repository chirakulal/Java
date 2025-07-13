package com.xworkz.interfaces.internal;

public interface ScannerDevice {

    void scanDocument();
    void preview();
    void saveDocument();
    default void send(){
        System.out.println("Running send in ScannerDevice");
    }
}
