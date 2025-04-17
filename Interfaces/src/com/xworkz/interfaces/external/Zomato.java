package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.FoodDelivery;

public class Zomato implements FoodDelivery {


    @Override
    public void takeOrder() {
        System.out.println("Running takeOrder in Zomato");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Running cancelOrder in Zomato");
    }

    @Override
    public void placeOrder() {
        System.out.println("Running placeOrder in Zomato");

    }

    @Override
    public void trackOrder() {
        System.out.println("Running trackOrder in Zomato");

    }
}
