package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Restaurant;

public class KFC implements Restaurant {

    @Override
    public void takeOrder() {
        System.out.println("Running takeOrder in KFC");
    }

    @Override
    public void serveFood() {
        System.out.println("Running serveFood in KFC");
    }

    @Override
    public void generateBill() {
        System.out.println("Running generateBill in KFC");
    }
}
