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
                ", waterResistant=" + waterResistant ;
    }

    @Override
    public int hashCode() {
        return 28;
    }
}
