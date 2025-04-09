package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bank;

public class Account extends Bank {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    @Override
    public void balance(){
        System.out.println("Running balance in Account");
    }
    @Override
    public void save(){
        System.out.println("Running save in Account");
    }
    @Override
    public void withdraw(){
        System.out.println("Running withdraw in Account");
    }
    @Override
    public void sendmsg(){
        System.out.println("Running sendMsg in Account");
    }
    @Override
    public void deposit(){
        System.out.println("running deposit in Account");
    }
    public void credit(){
        System.out.println("Running credit in Account");
    }

    @Override
    public String toString() {
        return
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance ;
    }
}
