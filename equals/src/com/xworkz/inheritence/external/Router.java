package com.xworkz.inheritence.external;

public class Router {

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
        System.out.println("Parent :" + super.hashCode());
        return 22;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Router) {
                Router router = this;
                Router router1 = (Router) obj;
                if (router.brand.equals(router1.brand) &&
                        router.speedMbps == router1.speedMbps &&
                        router.isDualBand == router1.isDualBand) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
