package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.WaterPurifier;

public class Kent extends WaterPurifier {

    public Kent() {
        super();
        System.out.println("No-arg constructor in Kent");
    }

    @Override
    public void filterWater() {
        System.out.println("Running filterWater in Kent");
    }
    @Override
    public void removeGerms() {
        System.out.println("Running removeGerms in Kent");
    }
    @Override
    public void storeWater() {
        System.out.println("Running storeWater in Kent");
    }
    @Override
    public void indicateLevel() {
        System.out.println("Running indicateLevel in Kent");
    }
    @Override
    public void autoShutdown() {
        System.out.println("Running autoShutdown in Kent");
    }
}
