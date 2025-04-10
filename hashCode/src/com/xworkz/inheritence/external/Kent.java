package com.xworkz.inheritence.external;



public class Kent{

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
        return
                "modelName='" + modelName + '\'' +
                        ", capacity=" + capacity +
                        ", hasROTechnology=" + hasROTechnology;
    }

    @Override
    public int hashCode() {
        return 88;
    }
}
