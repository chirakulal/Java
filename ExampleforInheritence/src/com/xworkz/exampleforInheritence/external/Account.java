package com.xworkz.exampleforInheritence.external;


import com.xworkz.exampleforInheritence.internal.Bank;

public class Account extends Bank {

    public void depositMoney() {
        System.out.println("Running depositMoney in Account");
    }
}
