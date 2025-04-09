package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Newspaper;

public class Magazine extends Newspaper {

    private String title;
    private int issueNumber;
    private boolean isMonthly;


    public Magazine(String title, int issueNumber, boolean isMonthly) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.isMonthly = isMonthly;
    }
    @
    Override
    public void printNews() {
        System.out.println("Running printNews in Magazine");
    }

    @Override
    public void distribute() {
        System.out.println("Running distribute in Magazine");
    }

    @Override
    public void advertise() {
        System.out.println("Running advertise in Magazine");
    }

    @Override
    public void updateDaily() {
        System.out.println("Running updateDaily in Magazine");
    }

    @Override
    public void provideInformation() {
        System.out.println("Running provideInformation in Magazine");
    }

    public void read(){
        System.out.println("Running read in Magazine");
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", isMonthly=" + isMonthly ;
    }
}
