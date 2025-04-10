package com.xworkz.inheritence.external;

public class Bottel  {

    private String material;
    private int capacity;
    private boolean isInsulated;


    public Bottel(String material, int capacity, boolean isInsulated) {
        this.material = material;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", capacity=" + capacity +
                ", isInsulated=" + isInsulated;
    }

    @Override
    public int hashCode() {
        return 19;
    }
}
