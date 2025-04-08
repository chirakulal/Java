package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Festival;

public class Deepavali extends Festival {

    public Deepavali(){
        super();
        System.out.println("no-argu constructor running Deepavali");
    }
    @Override
    public void celebrate() {
        System.out.println("Running celebrate in Deepavali");
    }

    @
    Override
    public void decorate() {
        System.out.println("Running decorate in Deepavali");
    }

    @Override
    public void feast() {
        System.out.println("Running feast in Deepavali");
    }

    @Override
    public void enjoyMusic() {
        System.out.println("Running enjoyMusic in Deepavali");
    }

    @Override
    public void gatherPeople() {
        System.out.println("Running gatherPeople in Deepavali");
    }

}
