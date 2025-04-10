package com.xworkz.inheritence.external;

public class LEDBulb{
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
        return 40;
    }
}
