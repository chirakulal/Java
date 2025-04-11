package com.xworkz.inheritence.external;

public class Kent {

    private String modelName;
    private int capacity;
    private boolean hasROTechnology;

    public Kent(String modelName, int capacity, boolean hasROTechnology) {
        this.modelName = modelName;
        this.capacity = capacity;
        this.hasROTechnology = hasROTechnology;
    }

    @Override
    public String toString() {
        return "modelName='" + modelName + '\'' +
                ", capacity=" + capacity +
                ", hasROTechnology=" + hasROTechnology;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 88;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Kent) {
                Kent other = (Kent) obj;
                if (this.modelName.equals(other.modelName)) {
                    System.out.println("Both Kent objects are same based on modelName");
                    return true;
                }
            }
        }
        return false;
    }
}
