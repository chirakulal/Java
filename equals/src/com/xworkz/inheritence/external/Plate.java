package com.xworkz.inheritence.external;

public class Plate {

    private String material;
    private int diameter;
    private boolean isMicrowaveSafe;

    public Plate(String material, int diameter, boolean isMicrowaveSafe) {
        this.material = material;
        this.diameter = diameter;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                        ", diameter=" + diameter +
                        ", isMicrowaveSafe=" + isMicrowaveSafe;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 69;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Plate) {
                Plate plate = (Plate) obj;
                if (this.material.equals(plate.material) &&
                        this.diameter == plate.diameter) {
                    System.out.println("Both Plate objects are same based on material and diameter");
                    return true;
                }
            }
        }
        return false;
    }
}
