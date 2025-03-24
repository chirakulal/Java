package com.xworkz.internal;

public class Company {

    public String name = "CMV";
    double salary = 30000;
    private String role ="finance";

    public void hire(){
        System.out.println("Running hire in Company");
        System.out.println(this.role);
        this.fire();
    }

    private void fire(){
        System.out.println("Running fire im Company");
    }

    void work(){
        System.out.println("running work in Company");
    }
}
