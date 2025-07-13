package com.xworkz.interfaces.internal;

public interface Ecommerce {

    void browseItems();
    void addToCart();
    void checkout();
    default void deleteCart(){
        System.out.println("Running deleteCart in Ecommerce");
    }
}
