package com.xworkz.interfaces.internal;

public interface SocialMedia {

    void post();
    void like();
    void share();

    default  void story(){
        System.out.println("Running story in SocialMedia");
    }
}
