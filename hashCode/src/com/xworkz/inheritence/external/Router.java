package com.xworkz.inheritence.external;

public class Router  {

    private String brand;
    private int speedMbps;
    private boolean isDualBand;


    public Router(String brand, int speedMbps, boolean isDualBand) {
        this.brand = brand;
        this.speedMbps = speedMbps;
        this.isDualBand = isDualBand;
    }
    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", speedMbps=" + speedMbps +
                ", isDualBand=" + isDualBand;
    }

    @Override
    public int hashCode() {
        return 22;
    }
}
