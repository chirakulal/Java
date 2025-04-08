package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Currency;

public class DigitalCurrency extends Currency {
    public DigitalCurrency() {
        super();
        System.out.println("No-arg constructor is running in DigitalCurrency");
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

}
