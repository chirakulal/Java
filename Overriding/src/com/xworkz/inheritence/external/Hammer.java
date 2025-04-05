package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Tool;

public class Hammer extends Tool {
    public Hammer() {
        super();
        System.out.println("No-arg constructor is running in Hammer");
    }
    @Override
    public void use() {
        System.out.println("Running use in Hammer");
    }

    @Override
    public void repair() {
        System.out.println("Running repair in Hammer");
    }

    @Override
    public void maintain() {
        System.out.println("Running maintain in Hammer");
    }

    @Override
    public void storeSafely() {
        System.out.println("Running storeSafely in Hammer");
    }

    @Override

    public void checkDurability() {
        System.out.println("Running checkDurability in Hammer");
    }

}
