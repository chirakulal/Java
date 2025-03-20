package com.xworkz;

public class Shop {

    public void ads(Display display){
        System.out.println("Shop is running");
        if(display != null){
            display.run();
        }
        else{
            System.out.println("reference is pointing to null");
        }
    }
}
