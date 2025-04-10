package com.xworkz.inheritence.external;

public class SoftPillow {
    private String material;
    private String size;
    private boolean isWashable;


    public SoftPillow(String material, String size, boolean isWashable) {
        this.material = material;
        this.size = size;
        this.isWashable = isWashable;
    }


    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", isWashable=" + isWashable;
    }

    @Override
    public int hashCode() {
        return 94;
    }
}
