package com.xworkz.inheritence.internal;

public class Currency {

    public Currency() {
        System.out.println("No-arg constructor is running in Currency");
    }

    public void exchange() {
        System.out.println("Exchanging currency");
    }
    public void storeValue() {
        System.out.println("Storing value in currency");
    }
    public void transfer() {
        System.out.println("Transferring currency");
    }
    public void calculateValue() {
        System.out.println("Calculating currency value");
    }
    public void useForTransactions() {
        System.out.println("Using currency for transactions");
    }
}
