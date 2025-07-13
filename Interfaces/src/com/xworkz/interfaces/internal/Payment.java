package com.xworkz.interfaces.internal;

public interface Payment {

    void pay();
    void refund();
    void checkBalance();

    default void deposit(){
        System.out.println("running deposit in pay");
    }
}
