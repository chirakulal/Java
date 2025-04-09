package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Notebook;

public class Classmate extends Notebook {
    private String productType;
    private double price;
    private boolean isEcoFriendly;


    public Classmate(String productType, double price, boolean isEcoFriendly) {
        this.productType = productType;
        this.price = price;
        this.isEcoFriendly = isEcoFriendly;
    }

    public void writeNotes() {
        System.out.println("Running writeNotes in Classmate");
    }
    public void tearPage() {
        System.out.println("Running tearPage in Classmate");
    }
    public void staplePages() {
        System.out.println("Running staplePages in Classmate");
    }
    public void decorate() {
        System.out.println("Running decorate in Classmate");
    }
    public void label() {
        System.out.println("Running label in Classmate");
    }

    @Override
    public String toString() {
        return
                "productType='" + productType + '\'' +
                ", price=" + price +
                ", isEcoFriendly=" + isEcoFriendly ;
    }
}
