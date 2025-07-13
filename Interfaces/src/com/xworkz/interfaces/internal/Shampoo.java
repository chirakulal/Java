package com.xworkz.interfaces.internal;

public interface Shampoo {

    void applyShampoo();
    void rinseShampoo();
    void dryHair();

    default void smoothShampoo(){
        System.out.println("Running smoothShampoo in Shampoo");
    }
}
