package com.xworkz.inheritence.external;


public class DigitalClock {

    private String brand;
    private String timeFormat;
    private boolean hasAlarm;


    public DigitalClock(String brand, String timeFormat, boolean hasAlarm) {
        this.brand = brand;
        this.timeFormat = timeFormat;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", timeFormat='" + timeFormat + '\'' +
                ", hasAlarm=" + hasAlarm ;
    }

    @Override
    public int hashCode() {
        return 34;
    }
}
