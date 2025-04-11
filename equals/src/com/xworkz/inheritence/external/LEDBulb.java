package com.xworkz.inheritence.external;

public class LEDBulb {
    private int wattage;
    private int colorTemperature;
    private boolean isDimmable;

    public LEDBulb(int wattage, int colorTemperature, boolean isDimmable) {
        this.wattage = wattage;
        this.colorTemperature = colorTemperature;
        this.isDimmable = isDimmable;
    }

    @Override
    public String toString() {
        return
                "wattage=" + wattage +
                        ", colorTemperature=" + colorTemperature +
                        ", isDimmable=" + isDimmable;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 40;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof LEDBulb) {
                LEDBulb ledBulb = this;
                LEDBulb ledBulb1 = (LEDBulb) obj;
                if (ledBulb.wattage == ledBulb1.wattage &&
                        ledBulb.colorTemperature == ledBulb1.colorTemperature &&
                        ledBulb.isDimmable == ledBulb1.isDimmable) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
