package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Ecommerce;

public class Flipkart implements Ecommerce {


    @Override
    public void browseItems() {
        System.out.println("Running browseItems in Flipkart");
    }

    @Override
    public void addToCart() {
        System.out.println("Running addToCart in Flipkart");
    }

    @Override
    public void checkout() {
        System.out.println("Running checkout in Flipkart");
    }
}
