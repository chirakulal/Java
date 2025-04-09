package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.PaymentMethod;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private double creditLimit;


    public CreditCard(String cardNumber, String cardHolderName, double creditLimit) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.creditLimit = creditLimit;
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

    public void balance(){
        System.out.println("Running balance in CreditCard");
    }

    @Override
    public String toString() {
        return
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", creditLimit=" + creditLimit;
    }
}
