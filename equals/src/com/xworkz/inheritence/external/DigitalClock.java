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
                        ", hasAlarm=" + hasAlarm;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 34;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof DigitalClock) {
                DigitalClock digitalClock = this;
                DigitalClock digitalClock1 = (DigitalClock) obj;
                if (digitalClock.brand.equals(digitalClock1.brand)
                        && digitalClock.timeFormat.equals(digitalClock1.timeFormat)
                        && digitalClock.hasAlarm == digitalClock1.hasAlarm) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
