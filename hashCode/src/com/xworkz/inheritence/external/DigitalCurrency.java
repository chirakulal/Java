package com.xworkz.inheritence.external;


public class DigitalCurrency  {
    private String name;
    private double valueInUSD;
    private boolean isDecentralized;


    public DigitalCurrency(String name, double valueInUSD, boolean isDecentralized) {
        this.name = name;
        this.valueInUSD = valueInUSD;
        this.isDecentralized = isDecentralized;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", valueInUSD=" + valueInUSD +
                ", isDecentralized=" + isDecentralized ;
    }

    @Override
    public int hashCode() {
        return 39;
    }
}
