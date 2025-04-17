package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Soap;
import com.xworkz.interfaces.internal.Towel;

public class BathroomPack implements Towel, Soap {

    @Override
    public void washTowel() {
        System.out.println("Running method in BAthroomPack");
    }

    @Override
    public void dryBody() {
        System.out.println("Running method in BAthroomPack");

    }

    @Override
    public void wipeFace() {
        System.out.println("Running method in BAthroomPack");

    }

    @Override
    public void applySoap() {
        System.out.println("Running method in BAthroomPack");

    }

    @Override
    public void drySkin() {
        System.out.println("Running method in BAthroomPack");

    }

    @Override
    public void rinseSoap() {
        System.out.println("Running method in BAthroomPack");

    }
}
