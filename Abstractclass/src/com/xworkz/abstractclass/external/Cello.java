package com.xworkz.abstractclass.external;

import com.xworkz.abstractclass.internal.Bottle;

public class Cello extends Bottle {

    public Cello(String material,int capacity,String color){
        super(material,capacity,color);
        System.out.println("Parameterized constructor is running");
    }
}
