package com.xworkz.interfaces.internal;

public interface BankingApp {

    void login();
    void transferMoney();
    void checkBalance();

    default void deposit(){
        System.out.println("Running deposit in BankingApp");
    }
}
