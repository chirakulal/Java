package com.xworkz.interfaces.internal;

public interface Bank {

    void openAccount();
    void deposit();
    void withdraw();

    default void savings(){
        System.out.println("Running svaing in Bank");
    }
}
