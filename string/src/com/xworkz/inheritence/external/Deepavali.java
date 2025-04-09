package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Festival;

public class Deepavali extends Festival {

    private String date;
    private boolean isPublicHoliday;
    private int numberOfLamps;


    public Deepavali(String date, boolean isPublicHoliday, int numberOfLamps) {
        this.date = date;
        this.isPublicHoliday = isPublicHoliday;
        this.numberOfLamps = numberOfLamps;
    }
    @Override
    public void celebrate() {
        System.out.println("Running celebrate in Deepavali");
    }

    @
    Override
    public void decorate() {
        System.out.println("Running decorate in Deepavali");
    }

    @Override
    public void feast() {
        System.out.println("Running feast in Deepavali");
    }

    @Override
    public void enjoyMusic() {
        System.out.println("Running enjoyMusic in Deepavali");
    }

    @Override
    public void gatherPeople() {
        System.out.println("Running gatherPeople in Deepavali");
    }

    @Override
    public String toString() {
        return
                "date='" + date + '\'' +
                ", isPublicHoliday=" + isPublicHoliday +
                ", numberOfLamps=" + numberOfLamps;
    }
}
