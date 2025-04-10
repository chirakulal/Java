package com.xworkz.inheritence.external;


public class Deepavali  {

    private String date;
    private boolean isPublicHoliday;
    private int numberOfLamps;


    public Deepavali(String date, boolean isPublicHoliday, int numberOfLamps) {
        this.date = date;
        this.isPublicHoliday = isPublicHoliday;
        this.numberOfLamps = numberOfLamps;
    }

    @Override
    public String toString() {
        return
                "date='" + date + '\'' +
                ", isPublicHoliday=" + isPublicHoliday +
                ", numberOfLamps=" + numberOfLamps;
    }

    @Override
    public int hashCode() {
        return 54;
    }
}
