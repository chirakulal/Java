package com.xworkz.abstractclass.external;

import com.xworkz.abstractclass.internal.Oil;
import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

public class CoconutOil extends Oil {

    public CoconutOil (String brand, int quantity, String type,double price ){
        super(brand,quantity,type,price);
    }

    public  void displayDetails(){
        System.out.println("The the type of oil is : "+this.type);
        System.out.println("The quantity is : "+this.quantity);
        System.out.println("The brand is :"+this.brand);
        System.out.println("the price is : "+this.price);
    }
}
