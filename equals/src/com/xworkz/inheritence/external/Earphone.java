package com.xworkz.inheritence.external;

public class Earphone {

    private String brand;
    private boolean isWireless;
    private int batteryLife;

    public Earphone(String brand, boolean isWireless, int batteryLife) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", isWireless=" + isWireless +
                        ", batteryLife=" + batteryLife;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 56;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Earphone) {
                Earphone earphone = (Earphone) obj;
                if (this.brand.equals(earphone.brand)
                        && this.isWireless == earphone.isWireless) {
                    System.out.println("Both Earphone objects are same based on brand and isWireless");
                    return true;
                }
            }
        }
        return false;
    }
}
