package com.xworkz.inheritence.internal;

public class Newspaper {
    public Newspaper() {
        System.out.println("No-arg constructor is running in Newspaper");
    }

    public void printNews() { System.out.println("Printing news articles"); }

    public void distribute() { System.out.println("Distributing the newspaper"); }

    public void advertise() { System.out.println("Displaying advertisements"); }

    public void updateDaily() { System.out.println("Updating daily content"); }

    public void provideInformation() { System.out.println("Providing information to the public"); }
}
