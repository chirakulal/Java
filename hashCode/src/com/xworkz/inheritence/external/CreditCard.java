package com.xworkz.inheritence.external;


public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private double creditLimit;


    public CreditCard(String cardNumber, String cardHolderName, double creditLimit) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", creditLimit=" + creditLimit;
    }

    @Override
    public int hashCode() {
        return 30;
    }
}
