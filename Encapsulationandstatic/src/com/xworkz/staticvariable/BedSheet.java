package com.xworkz.staticvariable;

public class BedSheet {

    public static final String type;

   public BedSheet(){
        System.out.println("no-arg const is running");
    }

    static {
        type = "Cotton";
        System.out.println("Running static block");
    }


}
