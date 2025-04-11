package com.xworkz.inheritence.external;

public class Magazine {

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
                        ", isMonthly=" + isMonthly;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 45;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Magazine) {
                Magazine magazine1 = this;
                Magazine magazine2 = (Magazine) obj;
                if (magazine1.issueNumber == magazine2.issueNumber &&
                        magazine1.isMonthly == magazine2.isMonthly) {
                    System.out.println("Both are same based on issueNumber and isMonthly");
                    return true;
                }
            }
        }
        return false;
    }
}
