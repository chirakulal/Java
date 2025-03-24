package com.xworkz.external;

import com.xworkz.internal.Product;

public class User {

    Product product;

    public User(Product product){
        this.product=product;
    }

    public void buy(){
        System.out.println("Running buy in User");
        this.product.headWash();
        System.out.println(this.product.type);
    }
}
