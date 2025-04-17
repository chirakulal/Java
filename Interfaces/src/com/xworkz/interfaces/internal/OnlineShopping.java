package com.xworkz.interfaces.internal;

public interface OnlineShopping {

    void searchProduct();
    void addToCart();
    void checkout();

    default void deliver(){
        System.out.println("Running deliver in ONlineShopping");
    }
}
