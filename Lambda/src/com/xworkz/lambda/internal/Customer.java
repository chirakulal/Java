package com.xworkz.lambda.internal;

public class Customer {


    public void buy(Bottle bottle){

        boolean value = bottle.test(10);
        System.out.println(value);

    }
}
