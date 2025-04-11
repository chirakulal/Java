package com.xworkz.inheritence.external;

public class CruiseShip {

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
        System.out.println("Parent : " + super.hashCode());
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof CruiseShip) {
                CruiseShip cruiseShip = (CruiseShip) obj;
                if (this.shipName.equals(cruiseShip.shipName) &&
                        this.capacity == cruiseShip.capacity) {
                    System.out.println("Both CruiseShip objects are same based on shipName and capacity");
                    return true;
                }
            }
        }
        return false;
    }
}
