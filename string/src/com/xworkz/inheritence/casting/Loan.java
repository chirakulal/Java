package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Account;
import com.xworkz.inheritence.internal.Bank;

public class Loan {

    public void pay(Bank bank){

        bank.balance();
        bank.deposit();
        bank.sendmsg();
        bank.save();
        bank.withdraw();
        if(bank instanceof Account){
            Account account = (Account) bank;
            account.sendmsg();
        }

    }
}
