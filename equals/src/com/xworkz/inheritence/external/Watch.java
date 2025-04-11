package com.xworkz.inheritence.external;

public class Watch {

    private String brand;
    private boolean isDigital;
    private boolean waterResistant;

    public Watch(String brand, boolean isDigital, boolean waterResistant) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.waterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", isDigital=" + isDigital +
                        ", waterResistant=" + waterResistant;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 28;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Watch) {
                Watch watch = this;
                Watch watch1 = (Watch) obj;
                if (watch.brand.equals(watch1.brand) &&
                        watch.isDigital == watch1.isDigital &&
                        watch.waterResistant == watch1.waterResistant) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
