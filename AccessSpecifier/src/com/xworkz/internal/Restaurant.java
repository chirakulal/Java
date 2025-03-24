package com.xworkz.internal;

public class Restaurant {

   public String name ="avb";
    String quality = "good";
    private  int price = 400;

    public void serve(){
        System.out.println(this.price);
        this.present();
    }
    private void present(){
        System.out.println("Running present in restaurant");
    }
    void eat(){
        System.out.println("Running eat in restaurant");
    }
}
