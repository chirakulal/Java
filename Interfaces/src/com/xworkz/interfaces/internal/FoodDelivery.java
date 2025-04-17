package com.xworkz.interfaces.internal;

public interface FoodDelivery {

    void placeOrder();
    void trackOrder();
    void cancelOrder();

    default void takeOrder(){
        System.out.println("Running takeOrder in FoodDelivery");
    }
}
