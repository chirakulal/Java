package com.xworkz;

public class Fever {

    public void takeTablet(Dolo dolo){
        System.out.println("Dolo is running");
        if(dolo!=null){
            dolo.drink();
        }
        else {
            System.out.println("refrence is pointing to null");
        }
    }
}
