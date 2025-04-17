package com.xworkz.interfaces.internal;

public interface Delivery {

    void pickup();
    void deliver();
    void returnItem();

    default void cancel(){
        System.out.println("Running cancel in Delivery");
    }
}
