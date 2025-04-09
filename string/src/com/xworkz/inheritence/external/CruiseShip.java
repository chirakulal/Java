package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Ships;

public class CruiseShip extends Ships {

    private String shipName;
    private int capacity;
    private boolean hasSwimmingPool;


    public CruiseShip(String shipName, int capacity, boolean hasSwimmingPool) {
        this.shipName = shipName;
        this.capacity = capacity;
        this.hasSwimmingPool = hasSwimmingPool;
    }
    @Override
    public void sail() {
        System.out.println("Running sail in CruiseShip");
    }

    @Override
    public void anchor() {
        System.out.println("Running anchor in CruiseShip");
    }

    @Override
    public void carryCargo() {
        System.out.println("Running carryCargo in CruiseShip");
    }

    @Override
    public void navigate() {
        System.out.println("Running navigate in CruiseShip");
    }

    @Override
    public void signal() {
        System.out.println("Running signal in CruiseShip");
    }

    @Override
    public String toString() {
        return
                "shipName='" + shipName + '\'' +
                ", capacity=" + capacity +
                ", hasSwimmingPool=" + hasSwimmingPool;
    }
}
