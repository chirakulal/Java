package com.xworkz.inheritence.external;

public class Bottel {

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
        System.out.println("Parent :" + super.hashCode());
        return 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bottel) {
                Bottel bottel = this;
                Bottel bottel1 = (Bottel) obj;
                if (bottel.material.equals(bottel1.material) &&
                        bottel.capacity == bottel1.capacity &&
                        bottel.isInsulated == bottel1.isInsulated) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
