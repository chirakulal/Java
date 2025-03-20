package com.xworkz;

public class Nasa {

    public void research(Space space){
        System.out.println("Research is running ");
        if(space!=null){
            space.exploreGalaxy();
        }
        else {
            System.out.println("reference is pointing to null");
        }
    }
}
