package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Soap;

public class DoveSoap implements Soap {

    @Override
    public void applySoap() {
        System.out.println("Running applySoap in DoveSoap");
    }

    @Override
    public void rinseSoap() {
        System.out.println("Running rinseSoap in DoveSoap");
    }

    @Override
    public void drySkin() {
        System.out.println("Running drySkin in DoveSoap");
    }

    @Override
    public void clean() {
        System.out.println("running clean in DoveSoap");
    }
}
