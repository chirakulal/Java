package com.xworkz.inheritence.external;



public class Magazine  {

    private String title;
    private int issueNumber;
    private boolean isMonthly;


    public Magazine(String title, int issueNumber, boolean isMonthly) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.isMonthly = isMonthly;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", issueNumber=" + issueNumber +
                ", isMonthly=" + isMonthly ;
    }

    @Override
    public int hashCode() {
        return  45;
    }
}
