package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Shampoo;

public class CleanicPlus extends Shampoo {

    private String productType;
    private int volume;
    private boolean isAlcoholBased;


    public CleanicPlus(String productType, int volume, boolean isAlcoholBased) {
        this.productType = productType;
        this.volume = volume;
        this.isAlcoholBased = isAlcoholBased;
    }
    @Override
    public void apply() {
        System.out.println("Running apply in CleanicPlus");
    }

    @Override
    public void rinse() {
        System.out.println("Running rinse in CleanicPlus");
    }

    @Override
    public void wash() {
        System.out.println("Running wash in CleanicPlus");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in CleanicPlus");
    }

    @
    Override
    public void rub() {
        System.out.println("Running rub in CleanicPlus");
    }

    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", volume=" + volume +
                ", isAlcoholBased=" + isAlcoholBased;
    }
}
