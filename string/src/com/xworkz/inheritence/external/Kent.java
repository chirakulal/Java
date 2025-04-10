package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.WaterPurifier;

public class Kent extends WaterPurifier {

    private String modelName;
    private int capacity;
    private boolean hasROTechnology;


    public Kent(String modelName, int capacity, boolean hasROTechnology) {
        this.modelName = modelName;
        this.capacity = capacity;
        this.hasROTechnology = hasROTechnology;
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

    @Override
    public String toString() {
        return
                "modelName='" + modelName + '\'' +
                        ", capacity=" + capacity +
                        ", hasROTechnology=" + hasROTechnology;
    }
}
