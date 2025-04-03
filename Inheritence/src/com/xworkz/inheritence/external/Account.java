package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bank;

public class Account extends Bank {

    public Account(){
        super();
        System.out.println("no-argu const is running");
    }
}
