package com.xworkz.external;

import com.xworkz.internal.Bank;
import com.xworkz.internal.Manager;


public class Customer {

   private Bank bank;

   public Customer(Bank bank){
       this.bank =bank;

   }
   public void checkBalance(){
       System.out.println(this.bank.accountName);
       this.bank.checkBalance();
   }



}
