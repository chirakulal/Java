package com.xworkz.internal;

public class Product {

    public String type = "Shampoo";
    String qantity = "1000ml";
    private int price = 500;

     public  void headWash(){
        System.out.println("Running Headwash in Product");
        System.out.println(this.price);

    }
    private void bikeWash(){
        System.out.println("Running bikewash in Product");
    }

    void AntiDranruffuality(){
        System.out.println("Running anitdandruff in Product");
    }


}
