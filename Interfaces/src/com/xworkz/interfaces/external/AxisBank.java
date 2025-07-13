package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.BankingApp;

public class AxisBank implements BankingApp {

    @Override
    public void login() {
        System.out.println("Running login in AxisBank");
    }

    @Override
    public void transferMoney() {
        System.out.println("Running transferMoney in AxisBank");
    }

    @Override
    public void checkBalance() {
        System.out.println("Running checkBalance in AxisBank");
    }

    @Override
    public void deposit() {
        System.out.println("Running deposit in AxisBank");

    }
}
