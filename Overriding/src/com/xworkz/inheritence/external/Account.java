package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bank;

public class Account extends Bank {

    public Account(){
        super();
        System.out.println("no-argu const is running");
    }
    @Override
    public void balance(){
        System.out.println("Running balance in Account");
    }
    @Override
    public void save(){
        System.out.println("Running save in Account");
    }
    @Override
    public void withdraw(){
        System.out.println("Running withdraw in Account");
    }
    @Override
    public void sendmsg(){
        System.out.println("Running sendMsg in Account");
    }
    @Override
    public void deposit(){
        System.out.println("running deposit in Account");
    }
}
