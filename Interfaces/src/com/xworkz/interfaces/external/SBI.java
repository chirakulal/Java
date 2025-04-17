package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Bank;

public class SBI implements Bank {

    @Override
    public void openAccount() {
        System.out.println("Running openAccount in SBI");
    }

    @Override
    public void deposit() {
        System.out.println("Running deposit in SBI");
    }

    @Override
    public void withdraw() {
        System.out.println("Running withdraw in SBI");
    }
}
