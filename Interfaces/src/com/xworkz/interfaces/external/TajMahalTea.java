package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Tea;

public class TajMahalTea implements Tea {

    @Override
    public void boilWater() {
        System.out.println("Running boilWater in TajMahalTea");
    }

    @Override
    public void addTeaPowder() {
        System.out.println("Running addTeaPowder in TajMahalTea");
    }

    @Override
    public void serveTea() {
        System.out.println("Running serveTea in TajMahalTea");
    }
}
