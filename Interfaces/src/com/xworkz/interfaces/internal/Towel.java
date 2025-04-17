package com.xworkz.interfaces.internal;

public interface Towel {

    void wipeFace();
    void dryBody();
    void washTowel();

    default  void cleanTowel(){
        System.out.println("Running cleanTowel in towel");
    }
}
