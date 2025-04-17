package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.OnlineShopping;

public class Meesho implements OnlineShopping {

    @Override
    public void searchProduct() {
        System.out.println("Running searchProduct in Flipkart");
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
