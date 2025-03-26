package com.xworkz.encapsulation;

public class Customer {

    public  void reflection(Mirror mirror){


        System.out.println("The refelection is running Customer");
          if(mirror!=null){
              mirror.setShape("Round");
              mirror.setPrice(300);
              System.out.println(mirror.getPrice());
              System.out.println(mirror.getShape());
          }

    }
}
