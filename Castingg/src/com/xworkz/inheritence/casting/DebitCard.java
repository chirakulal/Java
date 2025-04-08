package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.CreditCard;
import com.xworkz.inheritence.internal.PaymentMethod;

public class DebitCard {
    public void pay(PaymentMethod paymentMethod){
        paymentMethod.viewTransactions();
        paymentMethod.makePayment();
        paymentMethod.validatePayment();
        paymentMethod.addFunds();
        paymentMethod.checkBalance();

        if(paymentMethod instanceof CreditCard){
            CreditCard creditCard =(CreditCard) paymentMethod;
            creditCard.balance();
        }

    }
}
