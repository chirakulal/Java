package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Species;

public class Elf extends Species {

    public Elf(){
        super();
        System.out.println("no-argu const in Elf");
    }
    public void fly(){
        System.out.println("Running fly in Elf");
    }

}
