package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Currency;

public class DigitalCurrency extends Currency {
    private String name;
    private double valueInUSD;
    private boolean isDecentralized;


    public DigitalCurrency(String name, double valueInUSD, boolean isDecentralized) {
        this.name = name;
        this.valueInUSD = valueInUSD;
        this.isDecentralized = isDecentralized;
    }
    @Override
    public void exchange() {
        System.out.println("Running exchange in DigitalCurrency");
    }

    @Override
    public void storeValue() {
        System.out.println("Running storeValue in DigitalCurrency");
    }

    @Override
    public void transfer() {
        System.out.println("Running transfer in DigitalCurrency");
    }

    @Override
    public void calculateValue() {
        System.out.println("Running calculateValue in DigitalCurrency");
    }

    @Override
    public void useForTransactions() {
        System.out.println("Running useForTransactions in DigitalCurrency");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", valueInUSD=" + valueInUSD +
                ", isDecentralized=" + isDecentralized ;
    }
}
