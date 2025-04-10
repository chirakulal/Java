package com.xworkz.inheritence.external;


public class CruiseShip  {

    private String shipName;
    private int capacity;
    private boolean hasSwimmingPool;


    public CruiseShip(String shipName, int capacity, boolean hasSwimmingPool) {
        this.shipName = shipName;
        this.capacity = capacity;
        this.hasSwimmingPool = hasSwimmingPool;
  }
    @Override
    public String toString() {
        return
                "shipName='" + shipName + '\'' +
                ", capacity=" + capacity +
                ", hasSwimmingPool=" + hasSwimmingPool;
    }

    @Override
    public int hashCode() {
        return 64;
    }
}
