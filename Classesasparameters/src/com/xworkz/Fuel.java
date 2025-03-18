package com.xworkz;

public class Fuel {

    public void burn(Rocket rocket){
        System.out.println("Fuel is running");
        if(rocket!=null){
            rocket.launch();
        }
        else {
            System.out.println("Reference is pointing to null");
        }
    }
}
