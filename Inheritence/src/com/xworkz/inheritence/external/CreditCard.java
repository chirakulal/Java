package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.PaymentMethod;

public class CreditCard extends PaymentMethod {
    public CreditCard() {
        super();
        System.out.println("No-arg constructor is running in CreditCard");
    }
}
