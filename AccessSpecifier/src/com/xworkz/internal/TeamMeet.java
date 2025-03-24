package com.xworkz.internal;

public class TeamMeet {

    Restaurant restaurant ;

    public TeamMeet(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    public  void  display(){
        System.out.println("Running display in teammeet");
        if(this.restaurant!=null){
            this.restaurant.eat();
            this.restaurant.serve();
            System.out.println(this.restaurant.name);
            System.out.println(this.restaurant.quality);
        }
    }
}
