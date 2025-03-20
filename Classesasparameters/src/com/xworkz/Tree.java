package com.xworkz;

public class Tree {
    public void grow(Mango mango){
        System.out.println("Tree is running");

        if(mango!=null){
            mango.ripen();
        }
        else {
            System.out.println("reference is pointing to null");
        }

    }
}
