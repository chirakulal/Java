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
        return "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", isWashable=" + isWashable;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SoftPillow) {
                SoftPillow other = (SoftPillow) obj;
                if (this.material.equals(other.material)) {
                    System.out.println("Both SoftPillow objects are same based on material");
                    return true;
                }
            }
        }
        return false;
    }
}
