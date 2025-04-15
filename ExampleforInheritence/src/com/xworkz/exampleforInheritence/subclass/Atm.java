package com.xworkz.exampleforInheritence.subclass;

import com.xworkz.exampleforInheritence.internal.Bank;

public class Atm extends Bank {
    public void checkBalance(){
        System.out.println("Running checkBalance in Atm");
    }
}
