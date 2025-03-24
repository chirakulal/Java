package com.xworkz.internal;

public class School {

    public String name ="VMSH";
    String garde = "5th";
    private double fees = 500000;

    public void requirement(){
        System.out.println("Running requirement in School");
        System.out.println(this.fees);
    }
    private void teach(){
        System.out.println("running teach in School");
    }
    void study(){
        System.out.println("Running study in School");
    }
}