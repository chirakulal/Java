package com.xworkz.inheritence.external;

public class DigitalCurrency {
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
                        ", isDecentralized=" + isDecentralized;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 39;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof DigitalCurrency) {
                DigitalCurrency digitalCurrency = this;
                DigitalCurrency digitalCurrency1 = (DigitalCurrency) obj;
                if (digitalCurrency.name.equals(digitalCurrency1.name) &&
                        digitalCurrency.valueInUSD == digitalCurrency1.valueInUSD &&
                        digitalCurrency.isDecentralized == digitalCurrency1.isDecentralized) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
