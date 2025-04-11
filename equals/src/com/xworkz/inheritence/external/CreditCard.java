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
        System.out.println("Parent :" + super.hashCode());
        return 30;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof CreditCard) {
                CreditCard creditCard = this;
                CreditCard creditCard1 = (CreditCard) obj;
                if (creditCard.cardNumber.equals(creditCard1.cardNumber) &&
                        creditCard.cardHolderName.equals(creditCard1.cardHolderName) &&
                        creditCard.creditLimit == creditCard1.creditLimit) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
