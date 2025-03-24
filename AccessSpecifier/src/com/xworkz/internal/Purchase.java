package com.xworkz.internal;

public class Purchase {

    Product product;

    public Purchase(Product product){
        this.product=product;
    }

    public void details(){
        System.out.println("Running details in Purchase");
        this.product.AntiDranruffuality();;
        this.product.headWash();
        System.out.println(this.product.qantity);
        System.out.println(this.product.type);
    }
}
