package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Shampoo;

public class ClinicPlus implements Shampoo {

    @Override
    public void applyShampoo() {
        System.out.println("Running applyShampoo in ClinicPlus");
    }

    @Override
    public void rinseShampoo() {
        System.out.println("Running rinseShampoo in ClinicPlus");
    }

    @Override
    public void dryHair() {
        System.out.println("Running dryHair in ClinicPlus");
    }

    @Override
    public void smoothShampoo() {
        System.out.println("Running smoothShampoo in Shampoo");
    }
}
