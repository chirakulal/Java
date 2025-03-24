package com.xworkz.internal;

public class Manager {

    Bank bank;

    public Manager(Bank bank){
        this.bank=bank;
    }

    public void details(){
        System.out.println("Running details in Manager");
        this.bank.accountDetails();
        this.bank.checkBalance();
        System.out.println(this.bank.accountName);
        System.out.println(this.bank.account);
    }
}

