package com.xworkz.inheritence.external;


public class Account  {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance ;
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
