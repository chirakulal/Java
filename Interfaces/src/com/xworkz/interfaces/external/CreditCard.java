package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Payment;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Running pay in Payment");
    }

    @Override
    public void refund() {
        System.out.println("Running refund inPayment");
    }

    @Override
    public void checkBalance() {
        System.out.println("Running checkBalance in Payment");
    }

    @Override
    public void deposit() {
        System.out.println("running deposit in CreditCard");

    }
}
