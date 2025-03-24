package com.xworkz.external;

import com.xworkz.internal.Restaurant;

public class Celebration {

    Restaurant restaurant;

    public Celebration(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    public void details(){
        System.out.println("Running details in Celebration");
        if(this.restaurant!=null){
            System.out.println(this.restaurant.name);
            this.restaurant.serve();
        }
    }
}
