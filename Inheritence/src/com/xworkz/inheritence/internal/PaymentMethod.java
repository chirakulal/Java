package com.xworkz.inheritence.internal;

public class PaymentMethod {

    public PaymentMethod() {
        System.out.println("No-arg constructor is running in PaymentMethod");
    }

    public void makePayment() {
        System.out.println("Making payment");
    }
    public void checkBalance() {
        System.out.println("Checking balance");
    }
    public void addFunds() {
        System.out.println("Adding funds");
    }
    public void viewTransactions() {
        System.out.println("Viewing transaction history");
    }
    public void validatePayment() {
        System.out.println("Validating payment method");
    }
}
