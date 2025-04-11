package com.xworkz.inheritence.external;

public class Deepavali {

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
        System.out.println("Parent : " + super.hashCode());
        return 54;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Deepavali) {
                Deepavali deepavali = (Deepavali) obj;
                if (this.date.equals(deepavali.date) &&
                        this.isPublicHoliday == deepavali.isPublicHoliday) {
                    System.out.println("Both Deepavali objects are same based on date and isPublicHoliday");
                    return true;
                }
            }
        }
        return false;
    }
}
