package com.xworkz.reference;

public class Projector {

    private Lens lens;


    public Projector(Lens lens){
        this.lens=lens;
    }

    public void present(){
        System.out.println("Running present in Projector");
        lens.zoom();
    }
}
