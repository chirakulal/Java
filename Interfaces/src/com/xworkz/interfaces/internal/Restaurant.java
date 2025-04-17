package com.xworkz.interfaces.internal;

public interface Restaurant {

    void takeOrder();
    void serveFood();
    void generateBill();

    default void deliver(){
        System.out.println("Running deliver in Restaurant");
    }
}
