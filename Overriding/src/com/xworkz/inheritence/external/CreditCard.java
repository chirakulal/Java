package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.PaymentMethod;

public class CreditCard extends PaymentMethod {
    public CreditCard() {
        super();
        System.out.println("No-arg constructor is running in CreditCard");
    }
    public void makePayment() {
        System.out.println("Running makePayment in CreditCard");
    }

    public void checkBalance() {
        System.out.println("Running checkBalance in CreditCard");
    }

    public void addFunds() {
        System.out.println("Running addFunds in CreditCard");
    }

    public void viewTransactions() {
        System.out.println("Running viewTransactions in CreditCard");
    }

    public void validatePayment() {
        System.out.println("Running validatePayment in CreditCard");
    }

}
