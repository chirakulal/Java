package com.xworkz;

public class Theater {
    public void show(Poster poster){
        System.out.println("Theater is running");
        if(poster != null){
            poster.showInfo();
        }
        else{
            System.out.println("reference is pointing to null");
        }

    }
}
