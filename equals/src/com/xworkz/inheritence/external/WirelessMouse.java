package com.xworkz.inheritence.external;

public class WirelessMouse {
    private String brand;
    private int batteryLife;
    private int dpi;

    public WirelessMouse(String brand, int batteryLife, int dpi) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                ", dpi=" + dpi;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 92;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WirelessMouse) {
                WirelessMouse other = (WirelessMouse) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both WirelessMouse objects are same based on brand");
                    return true;
                }
            }
        }
        return false;
    }
}
