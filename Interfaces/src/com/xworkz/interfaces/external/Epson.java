package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.ScannerDevice;

public class Epson implements ScannerDevice {

    @Override
    public void scanDocument() {
        System.out.println("Running scanDocument in Epson");
    }

    @Override
    public void preview() {
        System.out.println("Running preview in Epson");
    }

    @Override
    public void saveDocument() {
        System.out.println("Running saveDocument in Epson");
    }

    @Override
    public void send() {
        System.out.println("Running send in ScannerDevice");
    }
}
