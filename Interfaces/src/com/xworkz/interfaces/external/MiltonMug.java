package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Mug;

public class MiltonMug implements Mug {

    @Override
    public void fillMug() {
        System.out.println("Running fillMug in MiltonMug");
    }

    @Override
    public void emptyMug() {
        System.out.println("Running emptyMug in MiltonMug");
    }

    @Override
    public void cleanMug() {
        System.out.println("Running cleanMug in MiltonMug");
    }
}
